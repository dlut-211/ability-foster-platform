package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.dto.TestPaperDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.TestPaperDetailDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.TestPaperDetailKnowledgeDTO;
import edu.dlut.ssdut.abilityfosterplatform.enums.ResultEnum;
import edu.dlut.ssdut.abilityfosterplatform.enums.TestPaperStatusEnum;
import edu.dlut.ssdut.abilityfosterplatform.exception.PlatformException;
import edu.dlut.ssdut.abilityfosterplatform.mapper.TestPaperMapper;
import edu.dlut.ssdut.abilityfosterplatform.model.TestPaper;
import edu.dlut.ssdut.abilityfosterplatform.model.TestPaperDetail;
import edu.dlut.ssdut.abilityfosterplatform.model.TestPaperDetailKnowledge;
import edu.dlut.ssdut.abilityfosterplatform.repository.TestPaperDetailKnowledgeRepository;
import edu.dlut.ssdut.abilityfosterplatform.repository.TestPaperDetailRepository;
import edu.dlut.ssdut.abilityfosterplatform.repository.TestPaperRepository;
import edu.dlut.ssdut.abilityfosterplatform.service.TestPaperService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @AUTHOR: raymond
 * @DATE: 2019/10/19
 * DESCRIPTION: 试卷业务逻辑层
 **/

@Service
@Slf4j
public class TestPaperServiceImpl implements TestPaperService {

    @Autowired
    private TestPaperRepository testPaperRepository;

    @Autowired
    private TestPaperDetailRepository testPaperDetailRepository;

    @Autowired
    private TestPaperDetailKnowledgeRepository testPaperDetailKnowledgeRepository;

    @Autowired
    private TestPaperMapper testPaperMapper;

    /**
     * 添加试卷
     * @param testPaperDTO
     * @return
     */
    @Transactional
    @Override
    public Boolean addTestPaper(TestPaperDTO testPaperDTO) {
        // 1 添加试卷
        TestPaper testPaper = new TestPaper();
        BeanUtils.copyProperties(testPaperDTO, testPaper);
        testPaper.setStatus(TestPaperStatusEnum.TEST_PAPER_UNEXAMINED.getCode());
        // 2 添加试卷试题
        // 2.1 插入试卷
        TestPaper addedTestPaper = testPaperRepository.save(testPaper);
        if (addedTestPaper == null) {
            throw new PlatformException(ResultEnum.ADD_TEST_PAPER_FAIL);
        }
        Integer addTestPaperId = addedTestPaper.getId();
        // 2.2 为试卷试题添加刚加入的试卷id 作为外键
        Boolean testPaperInserted = false;
        if (!CollectionUtils.isEmpty(testPaperDTO.getA())) {
           testPaperInserted = addTestPaperDetailDTO(testPaperDTO.getA(), addTestPaperId);
        }
        if (testPaperInserted && !(CollectionUtils.isEmpty(testPaperDTO.getB()))) {
            testPaperInserted = addTestPaperDetailDTO(testPaperDTO.getB(), addTestPaperId);
        }
        return testPaperInserted;
    }

    /*
        试卷列表
     */

    @Override
    public Page<TestPaper> TestPaperPage(Integer classroomId, Pageable pageable){
        return testPaperRepository.findTestPapersByClassroomId(classroomId, pageable);
    }

    /*
        试卷删除
     */
    @Override
    public void remove(Integer testPaperId) {
        //1、按照testPaperId查询testPaper
        TestPaper testPaper = testPaperRepository.findById(testPaperId).orElse(null);
        if(ObjectUtils.isEmpty(testPaper)){
            throw new PlatformException(ResultEnum.TEST_PAPER_NOT_FOUND);
        }
        //2、查询所有外键为testPaperId的testPaperDetail
        List<TestPaperDetail> testPaperDetailList = testPaperDetailRepository.findAllByTestPaperId(testPaperId);
        if(!CollectionUtils.isEmpty(testPaperDetailList)){
            for (TestPaperDetail testPaperDetail : testPaperDetailList){
                //2.1 逐个删除
                //3、查询所有外键为TestPaperDetailId的testPaperDatailKnowledge
                List<TestPaperDetailKnowledge> testPaperDetailKnowledgeList = testPaperDetailKnowledgeRepository.findAllByTestPaperDetailId(testPaperDetail.getId());
                if(!CollectionUtils.isEmpty(testPaperDetailKnowledgeList)){
                    //3.1删除
                    for (TestPaperDetailKnowledge testPaperDetailKnowledge : testPaperDetailKnowledgeList){
                        testPaperDetailKnowledgeRepository.delete(testPaperDetailKnowledge);
                    }
                }
                testPaperDetailRepository.delete(testPaperDetail);
            }
        }
        testPaperRepository.delete(testPaper);
    }

    private Boolean addTestPaperDetailDTO(List<TestPaperDetailDTO> testPaperDetailDTOList, Integer testPaperId) {
        // 2.3 遍历试题列表
        for (TestPaperDetailDTO testPaperDetailDTO : testPaperDetailDTOList) {
            // 2.3.1 逐条插入试题详情
            TestPaperDetail testPaperDetail = new TestPaperDetail();
            BeanUtils.copyProperties(testPaperDetailDTO, testPaperDetail);
            testPaperDetail.setTestPaperId(testPaperId);
            // 2.3.2 新插入的试题详情
            TestPaperDetail addedTestPaperDetail = testPaperDetailRepository.save(testPaperDetail);
            if (addedTestPaperDetail == null) {
                throw new PlatformException(ResultEnum.ADD_TEST_PAPER_DETAIL_FAIL);
            }
            for (TestPaperDetailKnowledgeDTO testPaperDetailKnowledgeDTO : testPaperDetailDTO.getKnowledgeList()) {
                // 2.3.2.1 插入知识点列表
                TestPaperDetailKnowledge testPaperDetailKnowledge = new TestPaperDetailKnowledge();
                BeanUtils.copyProperties(testPaperDetailKnowledgeDTO, testPaperDetailKnowledge);
                testPaperDetailKnowledge.setTestPaperDetailId(addedTestPaperDetail.getId());
                testPaperDetailKnowledgeRepository.save(testPaperDetailKnowledge);
            }
        }
        return true;
    }

    @Override
    /**
     * @Author YuJunMing
     * @Date 2019/10/24 23:33
     * DESCRIPTION:
     */
    public TestPaper selectByPrimaryKey(Integer id) {
        return testPaperMapper.selectByPrimaryKey(id);

    }
}
