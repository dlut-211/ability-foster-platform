package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.dto.PStudentTestPaperDTO;
import edu.dlut.ssdut.abilityfosterplatform.service.AbilityService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class AbilityServiceImplTest {

    @Autowired
    private AbilityService abilityService;
    @Test
    public void procedureGetStudentTestPaper() {
        List<PStudentTestPaperDTO> pStudentTestPaperDTOs = abilityService.ProcedureGetStudentTestPaper(39);
        pStudentTestPaperDTOs.forEach(System.out::println);

    }
}