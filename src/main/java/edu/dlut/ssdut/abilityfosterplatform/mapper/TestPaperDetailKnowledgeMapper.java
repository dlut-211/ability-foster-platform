package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.TestPaperDetailKnowledge;

public interface TestPaperDetailKnowledgeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TestPaperDetailKnowledge record);

    int insertSelective(TestPaperDetailKnowledge record);

    TestPaperDetailKnowledge selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TestPaperDetailKnowledge record);

    int updateByPrimaryKey(TestPaperDetailKnowledge record);
}