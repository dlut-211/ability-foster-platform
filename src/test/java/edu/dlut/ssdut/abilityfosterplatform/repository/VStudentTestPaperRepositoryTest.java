package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.dto.PStudentTestPaperDTO;
import edu.dlut.ssdut.abilityfosterplatform.model.SystemOption;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.awt.print.Pageable;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class VStudentTestPaperRepositoryTest {

    @Autowired
    private VStudentTestPaperRepository vStudentTestPaperRepository;
    @Test
    public void getVStudentTestPapersByTestPaperId() {
        PageRequest request = PageRequest.of(0, 5);
        List<PStudentTestPaperDTO> pStudentTestPaperDTOS = vStudentTestPaperRepository.getVStudentTestPapersByTestPaperId(39);
        System.out.println(pStudentTestPaperDTOS.toArray()[0]);
        PStudentTestPaperDTO pStudentTestPaperDTO = (PStudentTestPaperDTO) pStudentTestPaperDTOS.toArray()[0];
        System.out.println(pStudentTestPaperDTO.getStudentNumber());


        System.out.println(vStudentTestPaperRepository.getCountStudentTestPaper(39));

        System.out.println(vStudentTestPaperRepository.getScoreByDAndDetailNumberAndTestPaperId(1,39)[1]);
    }
}