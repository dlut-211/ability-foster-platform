package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.dto.*;
import edu.dlut.ssdut.abilityfosterplatform.model.Ability;

import java.util.List;

public interface AbilityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ability record);

    int insertSelective(Ability record);

    Ability selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ability record);

    int updateByPrimaryKey(Ability record);

    List<SubjectTestAbilityScoreDTO>ProcedureGetSubjectTestAbilityScore(Integer subjectId,Integer studentId);

    List<SubjectWorkAbilityScoreDTO>ProcedureGetSubjectWorkAbilityScore(Integer subjectId, Integer studentId);

    List<SubjectTotalScoreDTO>ProcedureGetSubjectTotalScore(Integer subjectId, Integer studentId, Integer startNode, Integer limitSize);

    List<PStudentTestPaperDTO> ProcedureGetStudentTestPaper(Integer testPaperId);
}
