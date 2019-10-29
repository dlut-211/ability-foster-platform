package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ClassroomStudent;

import java.util.List;

public interface ClassroomStudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ClassroomStudent record);

    int insertSelective(ClassroomStudent record);

    ClassroomStudent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClassroomStudent record);

    int updateByPrimaryKey(ClassroomStudent record);

    List<ClassroomStudent>selectByClassroomId(Integer classroomId);
}
