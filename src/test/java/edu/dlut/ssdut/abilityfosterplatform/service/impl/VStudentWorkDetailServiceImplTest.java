package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.service.VStudentWorkDetailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VStudentWorkDetailServiceImplTest {

    @Autowired
    private VStudentWorkDetailService vStudentWorkDetailService;

    @Test
    public void findAllByStudentWorkId() {
        vStudentWorkDetailService.findAllByStudentWorkId(820).forEach(System.out::println);
    }
}