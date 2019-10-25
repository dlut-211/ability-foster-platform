package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.dto.ChapterDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.CourseDTO;

import java.util.List;

public interface ChapterService {

    /** 通过课程id返回ChapterDTO列表信息 **/
    List<ChapterDTO> findByCourseId(Integer id);

    /** 通过课程id返回CourseDTO **/
    CourseDTO findById(Integer id);
}
