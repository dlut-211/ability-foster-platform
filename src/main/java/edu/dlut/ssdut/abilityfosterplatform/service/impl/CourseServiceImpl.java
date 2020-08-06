package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.enums.ResultEnum;
import edu.dlut.ssdut.abilityfosterplatform.exception.PlatformException;
import edu.dlut.ssdut.abilityfosterplatform.model.*;
import edu.dlut.ssdut.abilityfosterplatform.repository.*;
import edu.dlut.ssdut.abilityfosterplatform.service.CourseService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.web.multipart.MultipartFile;


import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.lang.invoke.ConstantCallSite;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Author: raymond
 * @Date: 2019/11/5 20:00
 * @Description: 课程相关业务逻辑层
 **/
@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private VCourseRepository vCourseRepository;

    @Autowired
    private SystemOptionRepository systemOptionRepository;

    @Autowired
    private ChapterRepository chapterRepository;

    @Autowired
    private WorkKnowledgeRepository workKnowledgeRepository;

    @Autowired
    private WorkRepository workRepository;

    @Autowired
    private ClassroomRepository classroomRepository;

    @Autowired
    private KnowledgeRepository knowledgeRepository;

    @Value("${uploadFile.resourceHandler}")
    private String resourceHandler;

    @Value("${uploadFile.location}")
    private String uploadFileLocation;


    public final static String UPLOAD_PATH_PREFIX = "static/uploadFile/";
    /**
     * 通过课程编号、课程名称返回CourseDTO列表及分页信息
     * @param code 课程编号
     * @param name 课程名
     * @param pageable 分页信息
     * @return 分页列表
     */
    @Override
    public Page<VCourse> findByParams(String code, String name, Pageable pageable) {
        return vCourseRepository.findAllByCodeContainingAndNameContaining(code, name, pageable);
    }

    /**
     * 上传文件
     * @param request
     * @return
     */
    @Override
    public Map<String,String> uploadFile(MultipartFile uploadFile, HttpServletRequest request) {
        Map<String, String> map = new HashMap<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        // 构建文件上传所要保存的"文件夹路径"--这里是相对路径，保存到项目根路径的文件夹下
        String realPath = new String("src/main/resources/" + UPLOAD_PATH_PREFIX);
        // 存放上传文件的文件夹
     //   String format = sdf.format(new Date());
        // 存放上传文件的文件夹
        File file = new File(realPath);
        if(!file.isDirectory()){
            // 递归生成文件夹
            file.mkdirs();
        }
        System.out.println("文件的绝对路经"+file.getAbsolutePath());
        // 获取原始的名字  original:最初的，起始的  方法是得到原来的文件名在客户机的文件系统名称
        String fileName = uploadFile.getOriginalFilename();

        if (fileName != null && fileName != "") {
            // 新的文件名
            fileName = new Date().getTime() + "_" + new Random().nextInt(1000) + fileName;
        }
        map.put("fileName", fileName);
        try {
            //构建真实的文件路径
            File newFile = new File(file.getAbsolutePath() + File.separator + fileName);
            // 转存文件到指定路径，如果文件名重复的话，将会覆盖掉之前的文件,这里是把文件上传到 “绝对路径”
            System.out.println("新文件的绝对路经"+request.getScheme()+newFile.getAbsolutePath());
            uploadFile.transferTo(newFile);
            String filePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/uploadFile/" +  fileName;
            map.put("path", filePath);
            return map;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }


    /**
     * 获取所有的学科列表
     * @return
     */
    @Override
    public List<SystemOption> getAllSubjectList() {
        return systemOptionRepository.findAll();
    }

    /**
     * 修改试图中所显示的数据
     * @param vCourse
     * @return
     */
    @Override
    public Course updateCourse(VCourse vCourse) {
        Course course = courseRepository.findById(vCourse.getId()).orElse(null);
        Date createdOn = course.getCreatedOn();
        BeanUtils.copyProperties(vCourse, course);
        course.setCreatedOn(createdOn);
        // TODO 需要修改为当前登录的用户
        course.setCreatedBy(1000);
        return courseRepository.save(course);
    }


    /**
     * 删除课程
     * @param courseId
     */
    @Transactional
    @Override
    public Integer deleteCourse(Integer courseId) {
        Course course = courseRepository.findById(courseId).orElse(null);

        List<Classroom> classroomList = classroomRepository.findAllByCourseId(courseId);

        if (!CollectionUtils.isEmpty(classroomList)) {
            return ResultEnum.COURSE_BEING_USED.getCode();
        }
        // 1 如果课程未被引用
        // 2 删除章节
        List<Chapter> chapterList = chapterRepository.findByCourseIdOrderBySort(courseId);
        if (!CollectionUtils.isEmpty(chapterList)) {
            for (Chapter chapter : chapterList) {
                // 3 删除章节作业
                List<Work> workList = workRepository.findAllByChapterId(chapter.getId());
                if (!CollectionUtils.isEmpty(workList)) {
                    for (Work work : workList) {
                        List<WorkKnowledge> workKnowledgeList = workKnowledgeRepository.findAllByWorkId(work.getId());
                        if (!CollectionUtils.isEmpty(workKnowledgeList)) {
                            workKnowledgeRepository.deleteInBatch(workKnowledgeList);
                        }
                        workRepository.delete(work);
                    }
                }
                chapterRepository.delete(chapter);
            }
        }
        // 4 删除知识点
        List<Knowledge> knowledgeList = knowledgeRepository.findAllByCourseId(courseId);
        if (!CollectionUtils.isEmpty(knowledgeList)) {
            knowledgeRepository.deleteInBatch(knowledgeList);
        }
        courseRepository.delete(course);
        return ResultEnum.SUCCESS.getCode();
    }

}
