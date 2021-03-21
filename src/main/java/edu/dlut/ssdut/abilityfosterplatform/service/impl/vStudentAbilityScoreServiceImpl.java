package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.mapper.VStudentAbilityScoreMapper;
import edu.dlut.ssdut.abilityfosterplatform.model.VStudentAbilityScore;
import edu.dlut.ssdut.abilityfosterplatform.service.VStudentAbilityScoreService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class vStudentAbilityScoreServiceImpl implements VStudentAbilityScoreService {
    @Resource
    VStudentAbilityScoreMapper vStudentAbilityScoreMapper;
    @Override
    public List<VStudentAbilityScore> getListByClassroomIdAndSId(Integer classroomId, Integer studentId) {
        return vStudentAbilityScoreMapper.getListByClassroomIdAndSId(classroomId, studentId);
    }
}
