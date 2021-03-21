package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.enums.ResultEnum;
import edu.dlut.ssdut.abilityfosterplatform.exception.PlatformException;
import edu.dlut.ssdut.abilityfosterplatform.mapper.ClassroomTestRelationMapper;
import edu.dlut.ssdut.abilityfosterplatform.mapper.KnowledgeTestMapper;
import edu.dlut.ssdut.abilityfosterplatform.model.KnowledgeTest;
import edu.dlut.ssdut.abilityfosterplatform.service.ClassroomTestRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional
    @Override
    public int layoutClassWork(int classroomId, int knowledgeTestId) {
        int countTestWork = classroomTestRelationMapper.getCountTestWork(classroomId);
        if (countTestWork > 0) {
            return ResultEnum.TEST_NOT_END.getCode();
//            throw new PlatformException(ResultEnum.TEST_NOT_END);
        }
        return classroomTestRelationMapper.updateByClassIdAndkId(classroomId, knowledgeTestId);
    }


    @Override
    public int rollback(int classroomId, int knowledgeTestId) {
        return classroomTestRelationMapper.rollback(classroomId, knowledgeTestId);
    }
}
