package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.model.VStudentAbilityScore;

import java.util.List;

public interface VStudentAbilityScoreService {
    List<VStudentAbilityScore> getListByClassroomIdAndSId(Integer classroomId, Integer studentId);
}
