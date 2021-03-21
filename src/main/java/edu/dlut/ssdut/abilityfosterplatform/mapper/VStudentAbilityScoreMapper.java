package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.VStudentAbilityScore;

import java.util.List;

public interface VStudentAbilityScoreMapper {
    int insert(VStudentAbilityScore record);

    int insertSelective(VStudentAbilityScore record);

    List<VStudentAbilityScore> getListByClassroomIdAndSId(Integer classroomId, Integer studentId);
}