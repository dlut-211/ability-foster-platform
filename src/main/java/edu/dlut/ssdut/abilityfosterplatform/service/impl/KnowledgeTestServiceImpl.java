package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.mapper.KnowledgeTestMapper;
import edu.dlut.ssdut.abilityfosterplatform.model.KnowledgeTest;
import edu.dlut.ssdut.abilityfosterplatform.repository.KnowledgeTestRepository;
import edu.dlut.ssdut.abilityfosterplatform.service.KnowledgeTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Wdz
 * @Date 2021/3/12 16:59
 * @Description:
 */
@Service
public class KnowledgeTestServiceImpl implements KnowledgeTestService {

    @Autowired
    private KnowledgeTestRepository knowledgeTestRepository;

    @Resource
    private KnowledgeTestMapper knowledgeTestMapper;

    @Transactional
    @Override
    public KnowledgeTest add(KnowledgeTest knowledgeTest) {
        return knowledgeTestRepository.save(knowledgeTest);
    }

    @Transactional
    @Override
    public List<KnowledgeTest> list(Integer courseId, Integer chapterId) {
        return knowledgeTestMapper.findListByCourseIdAndChapterId(courseId, chapterId);
    }

    @Transactional
    @Override
    public int edit(KnowledgeTest knowledgeTest) {
        return knowledgeTestMapper.updateByPrimaryKey(knowledgeTest);
    }

    // TODO 删除课堂作业的时候，注意关联表的删除
    @Transactional
    @Override
    public void delect(Long id) {
        knowledgeTestMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<KnowledgeTest> findTreeInfo(Integer courseId, Integer knowledgeId) {
        return knowledgeTestRepository.findAllByCourseIdAndAndKnowledgeId(courseId, knowledgeId);
    }
}
