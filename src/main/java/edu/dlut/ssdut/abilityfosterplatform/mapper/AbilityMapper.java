package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.dto.PGetSubjectAbilityScoreDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.SubjectTestAbilityScoreDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.SubjectWorkAbilityScoreDTO;
import edu.dlut.ssdut.abilityfosterplatform.model.Ability;

import java.util.List;

public interface AbilityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ability record);

    int insertSelective(Ability record);

    Ability selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ability record);

    int updateByPrimaryKey(Ability record);

    List<SubjectTestAbilityScoreDTO>ProceduregetSubjectTestAbilityScore(Integer subjectId,Integer studentId);

    List<SubjectWorkAbilityScoreDTO>ProceduregetSubjectWorkAbilityScore(Integer subjectId, Integer studentId);

    List<PGetSubjectAbilityScoreDTO>ProcedureGetSubjectAbilityScore(Integer subjectId, Integer studentId);
}
