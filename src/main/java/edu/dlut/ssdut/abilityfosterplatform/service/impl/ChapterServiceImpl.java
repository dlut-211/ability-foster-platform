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
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.NumberUtils;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
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
                // chapterLevel表示是几级节点
                // TODO 暂定两层子节点？
            }
        }

        // 3 <1>中的Chapter的父节点 不必操作 只需直接删除chapter便取消了父节点对其的引用
        // 3.1 判断是否存在父节点
        // 3.1.1 如果parentId为空则为根节点 无父节点
        if (!ObjectUtils.isEmpty(chapter.getParentId())) {

        }
        // 3.1.2 如果parentId不为空则为中间节点 可能还有子节点 子节点可能还有子节点
        // 3.2 如果存在则查询Chapter的父节点
        // 3.3 删除父节点对其的引用
        // 4 删除该章节
        chapterRepository.delete(chapter);
    }

    @Transactional
    @Override
    public Chapter add(ChapterDTO chapterDTO) {
        // 1 将chapterDTO对象属性拷贝到chapter对象
        Chapter chapter = new Chapter();
        BeanUtils.copyProperties(chapterDTO, chapter);
        // 2 parentId 必须为已有chapter的主键
        List<Integer> chapterIdList = chapterRepository.findAll().stream().map(e -> e.getId()).collect(Collectors.toList());
        for (Integer chapterId : chapterIdList) {
            // 2.1 parentId 为已存在的chapter的主键方可插入
            if (chapterId.equals(chapterDTO.getParentId())) {

            }
        }
        // 3 同一章/节下不能存在同名章/节
        return null;
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

        return null;
    }

    @Transactional
    @Override
    public ChapterTreeDTO getChapterTree(Integer courseId) {
        return null;
    }

}
