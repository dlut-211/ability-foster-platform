package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.dto.*;
import edu.dlut.ssdut.abilityfosterplatform.model.Ability;

import java.util.List;

/**
 * @Author: raymond
 * @Date 2019/10/16 10:23
 * @Description:
 **/
public interface AbilityService {
    Ability selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ability record);

    List<SubjectTestAbilityScoreDTO> ProcedureGetSubjectTestAbilityScore(Integer subjectId, Integer studentId);

    List<SubjectWorkAbilityScoreDTO> ProcedureGetSubjectWorkAbilityScore(Integer subjectId, Integer studentId);

    List<SubjectTotalScoreDTO> ProcedureGetSubjectTotalScore(Integer subjectId, Integer studentId, Integer startNode, Integer limitSize);

    List<PStudentTestPaperDTO> ProcedureGetStudentTestPaper(Integer testPaperId);

}
