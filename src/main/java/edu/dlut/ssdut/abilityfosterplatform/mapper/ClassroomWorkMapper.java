package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ClassroomWork;

import java.util.List;

public interface ClassroomWorkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ClassroomWork record);

    int insertSelective(ClassroomWork record);

    ClassroomWork selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClassroomWork record);

    int updateByPrimaryKey(ClassroomWork record);

    List<ClassroomWork> getClassroomWork(Integer courseId);

    Integer insertClassroomWorkList(List<ClassroomWork> classroomWorkList);
}