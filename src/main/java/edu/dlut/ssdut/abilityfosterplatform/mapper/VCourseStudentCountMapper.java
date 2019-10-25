package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.VCourseStudentCount;

public interface VCourseStudentCountMapper {
    int insert(VCourseStudentCount record);

    int insertSelective(VCourseStudentCount record);
}