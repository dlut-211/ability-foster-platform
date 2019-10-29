package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.dto.*;
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
    public List<SubjectTestAbilityScoreDTO> ProcedureGetSubjectTestAbilityScore(Integer subjectId, Integer studentId) {
        return abilityMapper.ProcedureGetSubjectTestAbilityScore(subjectId,studentId);
    }

    @Override
    public List<SubjectWorkAbilityScoreDTO> ProcedureGetSubjectWorkAbilityScore(Integer subjectId, Integer studentId) {
        return abilityMapper.ProcedureGetSubjectWorkAbilityScore(subjectId,studentId);
    }

    @Override
    public List<SubjectTotalScoreDTO> ProcedureGetSubjectTotalScore(Integer subjectId, Integer studentId, Integer startNode, Integer limitSize) {
        return abilityMapper.ProcedureGetSubjectTotalScore(subjectId,studentId, startNode, limitSize);
    }

    @Override
    public List<PStudentTestPaperDTO> ProcedureGetStudentTestPaper(Integer testPaperId) {
        return abilityMapper.ProcedureGetStudentTestPaper(testPaperId);
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
