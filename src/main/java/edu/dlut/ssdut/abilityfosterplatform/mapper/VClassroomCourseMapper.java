package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.VClassroomCourse;

public interface VClassroomCourseMapper {
    int insert(VClassroomCourse record);

    int insertSelective(VClassroomCourse record);
}