package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.dto.TestPaperDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.TestPaperDetailDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.TestPaperDetailKnowledgeDTO;
import edu.dlut.ssdut.abilityfosterplatform.service.TestPaperService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
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

        testPaperDTO.setName("Introduction to Algebra");
        testPaperDTO.setClassroomId(2);
        testPaperDTO.setTestPaperType(1);
        testPaperDTO.setA(Arrays.asList(testPaperDetailDTO));

        Boolean result = testPaperService.addTestPaper(testPaperDTO);
        System.out.println(result);
    }
}