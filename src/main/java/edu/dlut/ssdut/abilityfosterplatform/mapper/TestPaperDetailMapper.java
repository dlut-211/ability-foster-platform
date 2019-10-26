package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.TestPaperDetail;

import java.util.List;

public interface TestPaperDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TestPaperDetail record);

    int insertSelective(TestPaperDetail record);

    TestPaperDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TestPaperDetail record);

    int updateByPrimaryKey(TestPaperDetail record);

    int getQuestionsNumber(Integer testPaperId);

    List<TestPaperDetail> getTestPaperDetailOrder(Integer detailType, Integer testPaperId);
}
