package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Classroomstudent;

public interface ClassroomstudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Classroomstudent record);

    int insertSelective(Classroomstudent record);

    Classroomstudent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Classroomstudent record);

    int updateByPrimaryKeyWithBLOBs(Classroomstudent record);

    int updateByPrimaryKey(Classroomstudent record);
}