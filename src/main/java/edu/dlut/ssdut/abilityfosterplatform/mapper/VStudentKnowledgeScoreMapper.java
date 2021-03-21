package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.VStudentKnowledgeScore;

import java.util.List;

public interface VStudentKnowledgeScoreMapper {
    int insert(VStudentKnowledgeScore record);

    int insertSelective(VStudentKnowledgeScore record);

    List<VStudentKnowledgeScore> getListByClassroomIdAndId(Integer classroomId, Integer studentId);
}