package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.dto.StudentTestResultDto;
import edu.dlut.ssdut.abilityfosterplatform.dto.TestDetailDTO;
import edu.dlut.ssdut.abilityfosterplatform.model.StudentKnowledgeTestRelation;

import java.util.List;

public interface StudentKnowledgeTestRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(StudentKnowledgeTestRelation record);

    int insertSelective(StudentKnowledgeTestRelation record);

    StudentKnowledgeTestRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(StudentKnowledgeTestRelation record);

    int updateByPrimaryKey(StudentKnowledgeTestRelation record);

    StudentKnowledgeTestRelation getByStudentId(Integer id, Long knowledgeTestId, Integer studentId);

    int getCorrectRateByClassroom(int classroomId, int testId);

    List<StudentTestResultDto> getTestByClassroomAndStudent(int classroomId, int studentId);

    TestDetailDTO getTestDetali(int knowledgeTestId, int studentId);
}