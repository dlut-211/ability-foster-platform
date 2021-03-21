package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.dto.StudentTestResultDto;
import edu.dlut.ssdut.abilityfosterplatform.dto.TestDetailDTO;
import edu.dlut.ssdut.abilityfosterplatform.model.StudentKnowledgeTestRelation;

import java.util.List;
import java.util.Map;

public interface StudentTestRelationService {
    void insert(StudentKnowledgeTestRelation studentKnowledgeTestRelation);

    int getCorrectRateByClassroom(int classroomId, int testId);

    List<StudentTestResultDto> getTestByClassroomAndStudent(int classroomId, int studentId);

    TestDetailDTO getTestDetail(int knowledgeTestId, int studentId);

    int delectStudentTests(int knowledgeTestId, int classroomId);

    Map<String, Integer> getPieNums(int knowledgeTestId, int classroomId);
}
