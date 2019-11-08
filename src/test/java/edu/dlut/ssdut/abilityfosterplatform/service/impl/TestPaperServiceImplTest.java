package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.dto.TestPaperDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.TestPaperDetailDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.TestPaperDetailKnowledgeDTO;
import edu.dlut.ssdut.abilityfosterplatform.model.TestPaper;
import edu.dlut.ssdut.abilityfosterplatform.service.TestPaperService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Arrays;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestPaperServiceImplTest {

    @Autowired
    private TestPaperService testPaperService;

    @Test
    public void addTestPaper() {
        TestPaperDetailKnowledgeDTO testPaperDetailKnowledgeDTO = new TestPaperDetailKnowledgeDTO(14, BigDecimal.ONE);
        TestPaperDetailDTO testPaperDetailDTO = new TestPaperDetailDTO();
        testPaperDetailDTO.setTitle("FirstOne");
        testPaperDetailDTO.setDetailNumber(1);
        testPaperDetailDTO.setDetailType(1);
        testPaperDetailDTO.setScore(5);
        testPaperDetailDTO.setKnowledgeList(Arrays.asList(testPaperDetailKnowledgeDTO));
        TestPaperDTO testPaperDTO = new TestPaperDTO();

        testPaperDTO.setName("软件测试");
        testPaperDTO.setClassroomId(19);
        testPaperDTO.setTestPaperType(2);
        testPaperDTO.setA(Arrays.asList(testPaperDetailDTO));

        TestPaper result = testPaperService.addTestPaper(testPaperDTO);
        System.out.println(result);
    }

    @Test
    public void editTestPaper(){
        TestPaperDetailKnowledgeDTO testPaperDetailKnowledgeDTO = new TestPaperDetailKnowledgeDTO(30, BigDecimal.ONE);
        TestPaperDetailDTO testPaperDetailDTO = new TestPaperDetailDTO();
        testPaperDetailDTO.setTitle("One");
        testPaperDetailDTO.setDetailNumber(2);
        testPaperDetailDTO.setDetailType(1);
        testPaperDetailDTO.setScore(10);
        testPaperDetailDTO.setKnowledgeList(Arrays.asList(testPaperDetailKnowledgeDTO));
        TestPaperDTO testPaperDTO = new TestPaperDTO();
        testPaperDTO.setId(46);
        testPaperDTO.setName("知识产权--1");
        testPaperDTO.setClassroomId(2);
        testPaperDTO.setTestPaperType(1);
        testPaperDTO.setA(Arrays.asList(testPaperDetailDTO));

        Boolean result = testPaperService.editTestPaper(testPaperDTO);
        System.out.println(result);
    }

    @Test
    public void remove() {
        testPaperService.remove(40);
    }

    @Test
    public void list() {
        PageRequest request = PageRequest.of(0, 5);
        Page<TestPaperDTO> testPaperDTOPage = testPaperService.getTestPaperPage(27, request);
        testPaperDTOPage.getContent().forEach(System.out::println);
    }
}
