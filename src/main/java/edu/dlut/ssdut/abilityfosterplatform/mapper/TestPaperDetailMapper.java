package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.TestPaperDetail;

public interface TestPaperDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TestPaperDetail record);

    int insertSelective(TestPaperDetail record);

    TestPaperDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TestPaperDetail record);

    int updateByPrimaryKeyWithBLOBs(TestPaperDetail record);

    int updateByPrimaryKey(TestPaperDetail record);
}