package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.dto.StudentTestResultDto;
import edu.dlut.ssdut.abilityfosterplatform.dto.TestDetailDTO;
import edu.dlut.ssdut.abilityfosterplatform.mapper.ClassroomTestRelationMapper;
import edu.dlut.ssdut.abilityfosterplatform.mapper.StudentKnowledgeTestRelationMapper;
import edu.dlut.ssdut.abilityfosterplatform.model.ClassroomTestRelation;
import edu.dlut.ssdut.abilityfosterplatform.model.StudentKnowledgeTestRelation;
import edu.dlut.ssdut.abilityfosterplatform.service.StudentTestRelationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class StudentTestRelationServiceImpl implements StudentTestRelationService {
    @Resource
    StudentKnowledgeTestRelationMapper studentKnowledgeTestRelationMapper;
    @Resource
    ClassroomTestRelationMapper classroomTestRelationMapper;

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

    @Override
    public int delectStudentTests(int knowledgeTestId, int classroomId) {
        // 撤销之前先将该堂课的关系表中的状态置为未发布
        classroomTestRelationMapper.rollback(classroomId, knowledgeTestId);
        return studentKnowledgeTestRelationMapper.deleteByIds(knowledgeTestId, classroomId);
    }

    @Override
    public Map<String, Integer> getPieNums(int knowledgeTestId, int classroomId) {
        return studentKnowledgeTestRelationMapper.pieNums(knowledgeTestId, classroomId);
    }
}
