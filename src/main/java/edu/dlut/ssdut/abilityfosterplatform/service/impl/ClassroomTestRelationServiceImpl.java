package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.mapper.ClassroomTestRelationMapper;
import edu.dlut.ssdut.abilityfosterplatform.mapper.KnowledgeTestMapper;
import edu.dlut.ssdut.abilityfosterplatform.model.KnowledgeTest;
import edu.dlut.ssdut.abilityfosterplatform.service.ClassroomTestRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ClassroomTestRelationServiceImpl implements ClassroomTestRelationService {
    @Autowired
    ClassroomTestRelationMapper classroomTestRelationMapper;
    @Autowired
    KnowledgeTestMapper knowledgeTestMapper;
    @Override
    public List<KnowledgeTest> getALlTestById(int chapterId, int classroomId) {
        List<Integer> testIds = classroomTestRelationMapper.getTestByClassroomId(classroomId, 1);
        List<KnowledgeTest> testList = knowledgeTestMapper.getTestByTestIds(testIds, chapterId);
        return testList;
    }
}
