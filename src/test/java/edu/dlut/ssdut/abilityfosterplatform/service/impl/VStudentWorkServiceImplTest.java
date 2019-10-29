package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.service.VStudentWorkService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VStudentWorkServiceImplTest {

    @Autowired
    private VStudentWorkService vStudentWorkService;

    @Test
    public void findStudentWork() {
        System.out.println(vStudentWorkService.findStudentWork(82));
    }
}