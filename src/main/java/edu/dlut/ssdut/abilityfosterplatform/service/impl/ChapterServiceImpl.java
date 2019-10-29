package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.dto.ChapterDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.ChapterTreeDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.CourseDTO;
import edu.dlut.ssdut.abilityfosterplatform.enums.ResultEnum;
import edu.dlut.ssdut.abilityfosterplatform.exception.PlatformException;
import edu.dlut.ssdut.abilityfosterplatform.model.Chapter;
import edu.dlut.ssdut.abilityfosterplatform.model.Course;
import edu.dlut.ssdut.abilityfosterplatform.model.SystemOption;
import edu.dlut.ssdut.abilityfosterplatform.model.Teacher;
import edu.dlut.ssdut.abilityfosterplatform.repository.ChapterRepository;
import edu.dlut.ssdut.abilityfosterplatform.repository.CourseRepository;
import edu.dlut.ssdut.abilityfosterplatform.repository.SystemOptionRepository;
import edu.dlut.ssdut.abilityfosterplatform.repository.TeacherRepository;
import edu.dlut.ssdut.abilityfosterplatform.service.ChapterService;
import org.apache.tomcat.util.bcel.classfile.Constant;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.NumberUtils;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ChapterServiceImpl implements ChapterService {

    @Autowired
    private ChapterRepository chapterRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private SystemOptionRepository systemOptionRepository;

    @Autowired
    private TeacherRepository teacherRepository;

    /**
     * 通过课程id返回ChapterDTO列表信息
     * @param id
     * @return
     */
    @Transactional
    @Override
    public List<ChapterDTO> findByCourseId(Integer id) {
        List<Chapter> chapterList = chapterRepository.findByCourseId(id);
        List<ChapterDTO> chapterDTOList = new ArrayList<>();
        CourseDTO courseDTO = findById(id);
        for (Chapter chapter : chapterList) {
            ChapterDTO chapterDTO = new ChapterDTO();
            BeanUtils.copyProperties(chapter, chapterDTO);
            chapterDTO.setCourseDTO(courseDTO);
            chapterDTO.setCreatedByName(courseDTO.getCreatedByName());
            chapterDTOList.add(chapterDTO);
        }
        return chapterDTOList;
    }

    @Transactional
    @Override
    public CourseDTO findById(Integer id) {
        Course course = courseRepository.findById(id).orElse(null);
        Teacher teacher = teacherRepository.findById(course.getCreatedBy()).orElse(null);
        CourseDTO courseDTO = new CourseDTO();
        BeanUtils.copyProperties(course, courseDTO);
        courseDTO.setCreatedByName(teacher.getName());
        Integer subjectId = course.getSubjectId();
        SystemOption systemOption = systemOptionRepository.findById(subjectId).orElse(null);
        courseDTO.setSystemOption(systemOption);
        courseDTO.setSubjectName(systemOption.getOptionValue());
        return courseDTO;
    }

    @Transactional
    @Override
    public void delete(Integer chapterId) {
        // 1 按chapterId查询Chapter对象
        Chapter chapter = chapterRepository.findById(chapterId).orElse(null);
        if (ObjectUtils.isEmpty(chapter)) {
            throw new PlatformException(ResultEnum.CHAPTER_NOT_FOUND);
        }
        // 2 <1>中Chapter的所有子节点
        // 2.1 判断是否存在子节点 如果列表不为空则有子节点
        List<Chapter> chapterList = chapterRepository.findAllByParentId(chapterId);
        if (!CollectionUtils.isEmpty(chapterList)) {
            // 2.2 删除其下的所有子节点
            for (Chapter child : chapterList) {
                // 2.3 每一个子节点下可能还有子节点 子节点下可能还有子节点...到底该怎么判断终止条件
                // TODO 暂定两层子节点
                List<Chapter> subChapterList = chapterRepository.findAllByParentId(child.getId());
                if (!CollectionUtils.isEmpty(subChapterList)) {
                    for (Chapter subChild : subChapterList) {
                        chapterRepository.delete(subChild);
                    }
                }
                chapterRepository.delete(child);
            }
        }
        chapterRepository.delete(chapter);
    }

    @Transactional
    @Override
    public Chapter add(ChapterDTO chapterDTO) {
        // 1 将chapterDTO对象属性拷贝到chapter对象
        Chapter chapter = new Chapter();
        BeanUtils.copyProperties(chapterDTO, chapter);
        List<Chapter> checkChapterList = chapterRepository.findAllByChapterLevelAndParentIdAndCourseId(chapter.getChapterLevel(), chapter.getParentId(), chapter.getCourseId());
        if (!CollectionUtils.isEmpty(checkChapterList)) {
            for (Chapter check : checkChapterList) {
                if (check.getName().equals(chapterDTO.getName())) {
                    throw new PlatformException(ResultEnum.CHAPTER_EXISTS);
                }
            }
        }
        // 2 parentId 必须为已有chapter的主键(或者为空 为空则说明是一级章节点)
        //  其实这点在前边传过来时是已经必然存在的，因为在课程下看章节，章节下建章节，只要显示就一定存在  这里只是写着玩
        // 3 同一章/节下不能存在同名章/节
        List<Integer> chapterIdList = chapterRepository.findAll().stream().map(e -> e.getId()).collect(Collectors.toList());
        if (!chapterIdList.contains(chapterDTO.getParentId()) && !ObjectUtils.isEmpty(chapterDTO.getParentId())) {
            throw new PlatformException(ResultEnum.CHAPTER_PARENT_NOT_EXIST);
        }
        // TODO Sort编号未定
        if (ObjectUtils.isEmpty(chapterDTO.getParentId()) || ObjectUtils.isEmpty(chapterDTO.getChapterLevel())) {
            chapter.setChapterLevel(1);
        }
        chapter.setCreatedOn(new Date());
        chapter.setCreatedBy(1000);
        chapter.setModifiedOn(new Date());
        chapter.setModifiedBy(1000);
        return chapterRepository.save(chapter);
    }

    @Transactional
    @Override
    public Chapter edit(ChapterDTO chapterDTO) {
        // 1 首先查询出chapter对象
        Chapter chapter = chapterRepository.findById(chapterDTO.getId()).orElse(null);
        if (ObjectUtils.isEmpty(chapter)) {
            throw new PlatformException(ResultEnum.CHAPTER_NOT_FOUND);
        }
        // 2 将chapterDTO中的新数据设置回去
        BeanUtils.copyProperties(chapterDTO, chapter);
        // TODO Sort编号未定
        return chapterRepository.save(chapter);
    }

    /**
     * 生成课程下的章节树
     * @param courseId
     * @return
     */
    @Transactional
    @Override
    public List<ChapterTreeDTO> getChapterTree(Integer courseId) {
        // TODO 需要改成递归形式
        // 1 获取当前课程下的章节列表
        List<Chapter> chapterList = chapterRepository.findByCourseId(courseId);
        if (CollectionUtils.isEmpty(chapterList)) {
            return null;
        }
        // ! 最外层的列表
        List<ChapterTreeDTO> chapterTreeDTOList = new ArrayList<>();
        // 2 便利课程下的每一章节 生成章节树
        for (Chapter chapter : chapterList) {
            if (chapter.getChapterLevel() == 1) {
                // 2.1 拼装父章节
                ChapterTreeDTO fatherTreeDTO = new ChapterTreeDTO();
                // 2.1.1 拷贝基本属性 剩余子章节 List<ChapterTreeDTO>
                BeanUtils.copyProperties(chapter, fatherTreeDTO);
                // 2.2 判断是否有子节点 如果有获取同一父节点的孩子兄弟节点
                List<Chapter> childrenList = chapterRepository.findAllByParentId(chapter.getId());
                if (!CollectionUtils.isEmpty(childrenList)) {
                    List<ChapterTreeDTO> childTreeDTOList = new ArrayList<>();
                    for (Chapter child : childrenList) {
                        ChapterTreeDTO childTreeDTO = new ChapterTreeDTO();
                        // 2.3 把所查询到的chapter转换为chapterDTO
                        // 2.3.1 拷贝基本属性
                        BeanUtils.copyProperties(child, childTreeDTO);
                        // 2.3.2 判断是否有子节点
                        childTreeDTOList.add(childTreeDTO);
                    }
                    fatherTreeDTO.setChildren(childTreeDTOList);
                }
                chapterTreeDTOList.add(fatherTreeDTO);
            }
        }
        return chapterTreeDTOList;
    }

}
