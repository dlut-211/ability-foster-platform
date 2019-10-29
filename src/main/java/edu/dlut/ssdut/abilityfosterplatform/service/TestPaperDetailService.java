package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.dto.TestPaperListDetailDTO;
import edu.dlut.ssdut.abilityfosterplatform.model.TestPaperDetail;

import java.util.List;

public interface TestPaperDetailService {

    int deleteByPrimaryKey(Integer id);

    int insert(TestPaperDetail record);

    int insertSelective(TestPaperDetail record);

    TestPaperDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TestPaperDetail record);

    int updateByPrimaryKeyWithBLOBs(TestPaperDetail record);

    int updateByPrimaryKey(TestPaperDetail record);

    int getQuestionsNumber(Integer testPaperId);

    List<TestPaperDetail> getTestPaperDetailOrder(Integer detailType, Integer testPaperId);

    List<TestPaperListDetailDTO> getTestPaperDetailListA(Integer test_paper_id);
    List<TestPaperListDetailDTO> getTestPaperDetailListB(Integer test_paper_id);
}
