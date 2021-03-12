package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.mapper.StudentKnowledgeTestRelationMapper;
import edu.dlut.ssdut.abilityfosterplatform.model.StudentKnowledgeTestRelation;
import edu.dlut.ssdut.abilityfosterplatform.service.StudentTestRelationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentTestRelationServiceImpl implements StudentTestRelationService {
    @Resource
    StudentKnowledgeTestRelationMapper studentKnowledgeTestRelationMapper;
    @Override
    public void insert(StudentKnowledgeTestRelation studentKnowledgeTestRelation) {
        Integer studentId = studentKnowledgeTestRelation.getStudentId();
        StudentKnowledgeTestRelation relation = studentKnowledgeTestRelationMapper.getByStudentId(studentId);
        if (relation == null) {
            studentKnowledgeTestRelationMapper.insert(studentKnowledgeTestRelation);
        } else {
            studentKnowledgeTestRelation.setId(relation.getId());
            studentKnowledgeTestRelationMapper.updateByPrimaryKey(studentKnowledgeTestRelation);
        }
    }
}
