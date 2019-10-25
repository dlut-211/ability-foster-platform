package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.dto.PGetSubjectAbilityScoreDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.SubjectTestAbilityScoreDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.SubjectWorkAbilityScoreDTO;
import edu.dlut.ssdut.abilityfosterplatform.mapper.AbilityMapper;
import edu.dlut.ssdut.abilityfosterplatform.model.Ability;
import edu.dlut.ssdut.abilityfosterplatform.service.AbilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: raymond
 * @Date 2019/10/16 10:24
 * @Description: 能力点业务层实现类
 **/
@Service
public class AbilityServiceImpl implements AbilityService {

    @Autowired
    private AbilityMapper abilityMapper;

    @Override
    public List<SubjectTestAbilityScoreDTO> ProceduregetSubjectTestAbilityScore(Integer subjectId, Integer studentId) {
        return abilityMapper.ProceduregetSubjectTestAbilityScore(subjectId,studentId);
    }

    @Override
    public List<SubjectWorkAbilityScoreDTO> ProceduregetSubjectWorkAbilityScore(Integer subjectId, Integer studentId) {
        return abilityMapper.ProceduregetSubjectWorkAbilityScore(subjectId,studentId);
    }

    @Override
    public List<PGetSubjectAbilityScoreDTO> ProcedureGetSubjectAbilityScore(Integer subjectId, Integer studentId) {
        return abilityMapper.ProcedureGetSubjectAbilityScore(subjectId,studentId);
    }

    @Override
    public Ability selectByPrimaryKey(Integer id) {
        return abilityMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Ability record) {
        abilityMapper.updateByPrimaryKeySelective(record);
        return 0;
    }
}
