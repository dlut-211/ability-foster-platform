package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.StudentKnowledgeTestRelation;

public interface StudentKnowledgeTestRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(StudentKnowledgeTestRelation record);

    int insertSelective(StudentKnowledgeTestRelation record);

    StudentKnowledgeTestRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(StudentKnowledgeTestRelation record);

    int updateByPrimaryKey(StudentKnowledgeTestRelation record);

    StudentKnowledgeTestRelation getByStudentId(Integer studentId);
}