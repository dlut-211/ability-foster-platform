package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.VAllSubjectStudentTestPaperKnowledge;

import java.util.List;

public interface VAllSubjectStudentTestPaperKnowledgeMapper {
    int insert(VAllSubjectStudentTestPaperKnowledge record);

    int insertSelective(VAllSubjectStudentTestPaperKnowledge record);

    List<Integer> selectByStudentId(Integer studentId);
}
