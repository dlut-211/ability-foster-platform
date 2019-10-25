package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.mapper.TestPaperDetailMapper;
import edu.dlut.ssdut.abilityfosterplatform.model.TestPaperDetail;
import edu.dlut.ssdut.abilityfosterplatform.service.TestPaperDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestPaperDetailServiceImpl implements TestPaperDetailService {
    @Autowired
    private TestPaperDetailMapper testPaperDetailMapper;


    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(TestPaperDetail record) {
        return 0;
    }

    @Override
    public int insertSelective(TestPaperDetail record) {
        return 0;
    }

    @Override
    public TestPaperDetail selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(TestPaperDetail record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(TestPaperDetail record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(TestPaperDetail record) {
        return 0;
    }

    @Override
    public int getQuestionsNumber(Integer testPaperId) {
        return testPaperDetailMapper.getQuestionsNumber(testPaperId);
    }

    @Override
    public List<TestPaperDetail> getTestPaperDetailOrder(Integer detailType, Integer testPaperId) {
        return testPaperDetailMapper.getTestPaperDetailOrder(detailType,testPaperId);
    }


}
