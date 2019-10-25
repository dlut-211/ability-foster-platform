package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.model.SystemOption;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SystemOptionServiceTest {

    @Autowired
    SystemOptionService systemOptionService;

    @Test
    public void updateByPrimaryKeySelective() {
        SystemOption systemOption = new SystemOption();
        systemOption.setId(37);
        systemOption.setOptionCode("16");
        systemOptionService.updateByPrimaryKeySelective(systemOption);
    }
}