package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.dto.StudentTestResultDto;
import edu.dlut.ssdut.abilityfosterplatform.dto.TestDetailDTO;
import edu.dlut.ssdut.abilityfosterplatform.mapper.StudentKnowledgeTestRelationMapper;
import edu.dlut.ssdut.abilityfosterplatform.model.StudentKnowledgeTestRelation;
import edu.dlut.ssdut.abilityfosterplatform.service.StudentTestRelationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentTestRelationServiceImpl implements StudentTestRelationService {
    @Resource
    StudentKnowledgeTestRelationMapper studentKnowledgeTestRelationMapper;
    @Override
    public void insert(StudentKnowledgeTestRelation studentKnowledgeTestRelation) {
        Integer studentId = studentKnowledgeTestRelation.getStudentId();
        Long knowledgeTestId = studentKnowledgeTestRelation.getKnowledgeTestId();
        Integer classroomId = studentKnowledgeTestRelation.getClassroomId();
        StudentKnowledgeTestRelation relation = studentKnowledgeTestRelationMapper.getByStudentId(studentId, knowledgeTestId, classroomId);
        if (relation == null) {
            studentKnowledgeTestRelationMapper.insert(studentKnowledgeTestRelation);
        } else {
            studentKnowledgeTestRelation.setId(relation.getId());
            studentKnowledgeTestRelationMapper.updateByPrimaryKey(studentKnowledgeTestRelation);
        }
    }

    @Override
    public int getCorrectRateByClassroom(int classroomId, int testId) {
        int rate = studentKnowledgeTestRelationMapper.getCorrectRateByClassroom(classroomId, testId);
        return rate;
    }

    @Override
    public List<StudentTestResultDto> getTestByClassroomAndStudent(int classroomId, int studentId) {
        return studentKnowledgeTestRelationMapper.getTestByClassroomAndStudent(classroomId, studentId);
    }

    @Override
    public TestDetailDTO getTestDetail(int knowledgeTestId, int studentId) {
        return studentKnowledgeTestRelationMapper.getTestDetali(knowledgeTestId, studentId);
    }
}
