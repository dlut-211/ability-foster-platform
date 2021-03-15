package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.dto.StudentTestResultDto;
import edu.dlut.ssdut.abilityfosterplatform.dto.TestDetailDTO;
import edu.dlut.ssdut.abilityfosterplatform.model.StudentKnowledgeTestRelation;

import java.util.List;

public interface StudentTestRelationService {
    void insert(StudentKnowledgeTestRelation studentKnowledgeTestRelation);

    int getCorrectRateByClassroom(int classroomId, int testId);

    List<StudentTestResultDto> getTestByClassroomAndStudent(int classroomId, int studentId);

    TestDetailDTO getTestDetail(int knowledgeTestId, int studentId);
}
