package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.dto.ChapterDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.CourseDTO;
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
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

}
