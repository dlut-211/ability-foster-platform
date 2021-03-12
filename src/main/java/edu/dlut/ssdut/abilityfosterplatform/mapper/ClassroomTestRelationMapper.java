package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ClassroomTestRelation;

import java.util.List;

public interface ClassroomTestRelationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ClassroomTestRelation record);

    int insertSelective(ClassroomTestRelation record);

    ClassroomTestRelation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClassroomTestRelation record);

    int updateByPrimaryKey(ClassroomTestRelation record);

    List<Integer> getTestByClassroomId(int classroomId, int status);
}