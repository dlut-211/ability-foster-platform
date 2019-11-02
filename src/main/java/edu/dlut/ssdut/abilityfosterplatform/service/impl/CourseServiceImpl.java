package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.dto.CourseDTO;
import edu.dlut.ssdut.abilityfosterplatform.enums.ClassroomStatusEnum;
import edu.dlut.ssdut.abilityfosterplatform.enums.ResultEnum;
import edu.dlut.ssdut.abilityfosterplatform.exception.PlatformException;
import edu.dlut.ssdut.abilityfosterplatform.mapper.CourseMapper;
import edu.dlut.ssdut.abilityfosterplatform.model.*;
import edu.dlut.ssdut.abilityfosterplatform.repository.*;
import edu.dlut.ssdut.abilityfosterplatform.service.CourseService;
import edu.dlut.ssdut.abilityfosterplatform.utils.Const;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.*;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private SystemOptionRepository systemOptionRepository;

    @Autowired
    private TeacherRepository teacherRepository;

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

    @Autowired
    private CourseMapper courseMapper;

    @Value("${uploadFile.resourceHandler}")
    private String resourceHandler;

    @Value("${uploadFile.location}")
    private String uploadFileLocation;

    /**
     * 通过课程编号、课程名称返回CourseDTO列表及分页信息
     * @param code
     * @param name
     * @param pageable
     * @param request
     * @return
     */
    @Override
    public Page<CourseDTO> findByParams(String code, String name, Pageable pageable, HttpServletRequest request) {
        List<Course> courseList = courseRepository.findByCodeContainingAndNameContaining(code, name);
        List<CourseDTO> courseDTOList = new ArrayList<>();
        for (Course course : courseList) {
            CourseDTO courseDTO = new CourseDTO();
            SystemOption systemOption = systemOptionRepository.findById(course.getSubjectId()).orElse(null);
            if (systemOption == null) {
                throw new PlatformException(ResultEnum.SYSTEM_OPTION_NOT_FOUND);
            }
            BeanUtils.copyProperties(course, courseDTO);
            courseDTO.setSubjectName(systemOption.getOptionValue());
            Teacher teacher = teacherRepository.findById(course.getCreatedBy()).orElse(null);
            if (teacher == null) {
                throw new PlatformException(ResultEnum.TEACHER_NOT_FOUND);
            }
            courseDTO.setCreatedByName(teacher.getName());
//            courseDTO.setCreatedByName(Const.getUserName(request));
            courseDTOList.add(courseDTO);
        }
        Page<CourseDTO> courseDTOPage = new PageImpl<>(courseDTOList, pageable, courseDTOList.size());
        return courseDTOPage;
    }

    /**
     * 上传文件
     * @param file
     * @param request
     * @return
     */
    @Override
    public Map<String,String> uploadFile(MultipartFile file, HttpServletRequest request) {
        Map<String, String> map = new HashMap<>();
        // 获取上传的文件名加后缀
        String fileName = file.getOriginalFilename();
        map.put("fileName", fileName);
        if (fileName != null && fileName != "") {
            // 新的文件名
            fileName = new Date().getTime() + "_" + new Random().nextInt(1000) + fileName;
        }
        String url = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
        url = url + resourceHandler.substring(0, resourceHandler.lastIndexOf("/") + 1) + fileName;
        try {
            file.transferTo(new File(uploadFileLocation, fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        map.put("path", url);
        return map;
    }

    /**
     * 获取所有的学科列表
     * @return
     */
    @Override
    public List<SystemOption> getAllSubjectList() {
        List<SystemOption> systemOptionList = systemOptionRepository.findAll();
        return systemOptionList;
    }

    @Override
    public int updateCourseById(Course record) {
        return courseMapper.updateByPrimaryKey(record);
    }

    /**
     * 删除课程
     * @param courseId
     */
    @Transactional
    @Override
    public void deleteCourse(Integer courseId) {
        Course course = courseRepository.findById(courseId).orElse(null);
        if (ObjectUtils.isEmpty(course)) {
            throw new PlatformException(ResultEnum.COURSE_NOT_FOUND);
        }
        List<Classroom> classroomList = classroomRepository.findAllByCourseId(courseId);

        if (!CollectionUtils.isEmpty(classroomList)) {
            throw new PlatformException(ResultEnum.COURSE_BEING_USED);
        }
        // 1 如果课程未被引用
        // 2 删除章节
        List<Chapter> chapterList = chapterRepository.findByCourseId(courseId);
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
    }

}
