package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.dto.TestPaperABDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.TestPaperDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.TestPaperDetailDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.TestPaperDetailKnowledgeDTO;
import edu.dlut.ssdut.abilityfosterplatform.enums.ResultEnum;
import edu.dlut.ssdut.abilityfosterplatform.enums.TestPaperStatusEnum;
import edu.dlut.ssdut.abilityfosterplatform.exception.PlatformException;
import edu.dlut.ssdut.abilityfosterplatform.mapper.StudentTestPaperMapper;
import edu.dlut.ssdut.abilityfosterplatform.mapper.TestPaperDetailMapper;
import edu.dlut.ssdut.abilityfosterplatform.mapper.TestPaperMapper;
import edu.dlut.ssdut.abilityfosterplatform.model.StudentTestPaper;
import edu.dlut.ssdut.abilityfosterplatform.model.TestPaper;
import edu.dlut.ssdut.abilityfosterplatform.model.TestPaperDetail;
import edu.dlut.ssdut.abilityfosterplatform.model.TestPaperDetailKnowledge;
import edu.dlut.ssdut.abilityfosterplatform.repository.TestPaperDetailKnowledgeRepository;
import edu.dlut.ssdut.abilityfosterplatform.repository.TestPaperDetailRepository;
import edu.dlut.ssdut.abilityfosterplatform.repository.TestPaperRepository;
import edu.dlut.ssdut.abilityfosterplatform.service.TestPaperService;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

import javax.transaction.Transactional;
import java.util.*;

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

    @Autowired
    private StudentTestPaperMapper studentTestPaperMapper;

    /**
     * 添加试卷
     * @param testPaperDTO
     * @return
     */
    @Transactional
    @Override
    public TestPaper addTestPaper(TestPaperDTO testPaperDTO) {
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
        Integer addedTestPaperId = addedTestPaper.getId();
        // 2.2 为试卷试题添加刚加入的试卷id 作为外键
        Boolean testPaperInserted = false;
        if (!CollectionUtils.isEmpty(testPaperDTO.getA())) {
            testPaperInserted = addTestPaperDetailDTO(testPaperDTO.getA(), addedTestPaperId);
        }
        // 2.3 如果已成功插入 A 卷才可插入B卷
        if (testPaperInserted && !(CollectionUtils.isEmpty(testPaperDTO.getB()))) {
            addTestPaperDetailDTO(testPaperDTO.getB(), addedTestPaperId);
        }
        return addedTestPaper;
    }

    /**
     * 添加试卷详情
     * @param testPaperDetailDTOList
     * @param testPaperId
     * @return
     */
    private Boolean addTestPaperDetailDTO(List<TestPaperDetailDTO> testPaperDetailDTOList, Integer testPaperId) {
        // 2.3 遍历试题列表
        for (TestPaperDetailDTO testPaperDetailDTO : testPaperDetailDTOList) {
            // 2.3.1 逐条插入试题详情
            TestPaperDetail testPaperDetail = new TestPaperDetail();
            BeanUtils.copyProperties(testPaperDetailDTO, testPaperDetail);
            testPaperDetail.setTestPaperId(testPaperId);
            // 2.3.2 新插入的试题详情
            TestPaperDetail addedTestPaperDetail = testPaperDetailRepository.save(testPaperDetail);
            if (ObjectUtils.isEmpty(addedTestPaperDetail)) {
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

    /**
     * 试卷列表
     * @param classroomId
     * @param pageable
     * @return
     */

    @Override
    public Map<String, Object> TestPaperPage(Integer classroomId, Pageable pageable){
        List<TestPaperABDTO> testPaperABDTOS = new ArrayList<>();
        Page<TestPaper> TestPapers = testPaperRepository.findTestPapersByClassroomId(classroomId,pageable);
        for (TestPaper testPaper : TestPapers){
            TestPaperABDTO testPaperABDTO =new TestPaperABDTO();
            List<TestPaperDetail> testPaperDetailList= testPaperDetailRepository.findAllByTestPaperId(testPaper.getId());
            testPaperABDTO.setId(testPaper.getId());
            testPaperABDTO.setName(testPaper.getName());
            testPaperABDTO.setClassroomId(testPaper.getClassroomId());
            testPaperABDTO.setTestPaperType(testPaper.getTestPaperType());
            testPaperABDTO.setStatus(testPaper.getStatus());
            if (testPaperDetailList.size()==1){
                testPaperABDTO.setA(testPaperDetailList.get(0));
            }
            else if (testPaperDetailList.size()==2){
                testPaperABDTO.setA(testPaperDetailList.get(0));
                testPaperABDTO.setB(testPaperDetailList.get(1));
            }
            testPaperABDTOS.add(testPaperABDTO);
        }
        Map<String,Object> map = new HashMap<>();
        map.put("content",testPaperABDTOS);
        map.put("numberOfElements",TestPapers.getTotalElements());
        return map;
    }

    /**
     * 删除试卷
     * @param testPaperId
     */
    @Transactional
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

    /**
     * 编辑试卷
     * @param testPaperDTO
     * @return
     */

    @Transactional
    @Override
    public Boolean editTestPaper(TestPaperDTO testPaperDTO) {
        // 1、编辑试卷（试卷名称、试卷类型）
        // 1、1首先查询出该试卷
        TestPaper testPaper = testPaperRepository.findById(testPaperDTO.getId()).orElse(null);
        if (ObjectUtils.isEmpty(testPaper)){
            throw new PlatformException(ResultEnum.TEST_PAPER_NOT_FOUND);
        }
        List<TestPaperDetail> testPaperDetailList = testPaperDetailRepository.findAllByTestPaperId(testPaperDTO.getId());
        for (TestPaperDetail testPaperDetail : testPaperDetailList) {
            List<TestPaperDetailKnowledge> testPaperDetailKnowledgeList = testPaperDetailKnowledgeRepository.findAllByTestPaperDetailId(testPaperDetail.getId());
            for (TestPaperDetailKnowledge testPaperDetailKnowledge : testPaperDetailKnowledgeList) {
                testPaperDetailKnowledgeRepository.delete(testPaperDetailKnowledge);
            }
            testPaperDetailRepository.delete(testPaperDetail);
        }
        Boolean testPaperEdited = false;
        if (!CollectionUtils.isEmpty(testPaperDTO.getA())) {
            testPaperEdited = addTestPaperDetailDTO(testPaperDTO.getA(), testPaperDTO.getId());
        }
        if (testPaperEdited && !(CollectionUtils.isEmpty(testPaperDTO.getB()))) {
            testPaperEdited = addTestPaperDetailDTO(testPaperDTO.getB(), testPaperDTO.getId());
        }

        BeanUtils.copyProperties(testPaperDTO, testPaper);
        testPaper.setStatus(1);
        TestPaper editedTestPaper = testPaperRepository.save(testPaper);
        if (ObjectUtils.isEmpty(editedTestPaper)){
            throw new PlatformException(ResultEnum.EDIT_TEST_PAPER_FAIL);
        }
        return testPaperEdited;
    }

    /**
     * 布置考试
     * @param userId
     * @param status
     * @param id
     * @return
     */
    @Override
    public Boolean examined(Integer userId, Integer status,Integer id) {
        TestPaper testPaper = testPaperMapper.selectByPrimaryKey(id);
        testPaper.setStatus(status);
        testPaper.setCreatedBy(userId);
        testPaper.setCreatedOn(new Date());
        int i = testPaperMapper.updateByPrimaryKey(testPaper);
        if (i!=1){
            throw new PlatformException(ResultEnum.EDIT_TEST_PAPER_FAIL);
        }
        return true;
    }

    /**
     * 撤销考试
     * @param userId
     * @param status
     * @param id
     * @return
     */
    @Transactional
    @Override
    public Boolean revokeExamined(Integer userId, Integer status, Integer id) {
        TestPaper testPaper = testPaperMapper.selectByPrimaryKey(id);
        if (!ObjectUtils.isEmpty(testPaper)){
            testPaper.setModifiedBy(userId);
            testPaper.setModifiedOn(new Date());
            testPaper.setStatus(status);
            int i = testPaperMapper.updateByPrimaryKey(testPaper);
            if (i!=1){
                throw new PlatformException(ResultEnum.EDIT_TEST_PAPER_FAIL);
            }
            else {
                TestPaperDetail testPaperDetail = testPaperDetailRepository.findByTestPaperId(id);
                if (!ObjectUtils.isEmpty(testPaperDetail)) {
                    List<StudentTestPaper> studentTestPaperList = studentTestPaperMapper.selectByTestPaperDetailId(testPaperDetail.getId());
                    if (studentTestPaperList!=null){
                        for (StudentTestPaper studentTestPaper : studentTestPaperList) {
                            int flag=studentTestPaperMapper.deleteByPrimaryKey(studentTestPaper.getId());
                            if (flag!=1){
                                throw new PlatformException(ResultEnum.ADD_TEST_PAPER_DETAIL_FAIL);
                            }
                        }
                    }
                }
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
