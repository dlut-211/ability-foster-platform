package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.dto.SubjectTestAbilityScoreDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.SubjectWorkAbilityScoreDTO;
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

    List<SubjectTestAbilityScoreDTO> ProceduregetSubjectTestAbilityScore(Integer subjectId, Integer studentId);

    List<SubjectWorkAbilityScoreDTO> ProceduregetSubjectWorkAbilityScore(Integer subjectId, Integer studentId);
}
