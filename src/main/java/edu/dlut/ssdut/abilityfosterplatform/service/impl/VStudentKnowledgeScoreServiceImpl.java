package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.mapper.VStudentKnowledgeScoreMapper;
import edu.dlut.ssdut.abilityfosterplatform.model.VStudentKnowledgeScore;
import edu.dlut.ssdut.abilityfosterplatform.service.VStudentKnowledgeScoreService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class VStudentKnowledgeScoreServiceImpl implements VStudentKnowledgeScoreService {
    @Resource
    VStudentKnowledgeScoreMapper vStudentKnowledgeScoreMapper;
    @Override
    public List<VStudentKnowledgeScore> getListByClassroomIdAndSId(Integer classroomId, Integer studentId) {
        return vStudentKnowledgeScoreMapper.getListByClassroomIdAndId(classroomId, studentId);
    }
}
