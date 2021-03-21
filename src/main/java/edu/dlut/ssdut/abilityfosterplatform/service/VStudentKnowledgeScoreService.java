package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.model.VStudentKnowledgeScore;

import java.util.List;

public interface VStudentKnowledgeScoreService {
    List<VStudentKnowledgeScore> getListByClassroomIdAndSId(Integer classroomId, Integer studentId);
}
