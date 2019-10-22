package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.SystemOption;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SystemOptionRepositoryTest {

    @Autowired
    private SystemOptionRepository repository;

    @Test
    public void testSave() {
        SystemOption systemOption = new SystemOption();
        systemOption.setOptionCode("12");
        systemOption.setOptionValue("测试10");
        systemOption.setOptionType("Subject");
        systemOption.setOptionTypeName("学科");
        SystemOption result = repository.save(systemOption);
        Assert.assertNotNull(result);
    }

//    @Test
//    public void findSystemOptionsById() {
//        PageRequest request = PageRequest.of(1, 2);
//        Page<SystemOption> page = repository.findAll(request);
//        System.out.println("总数据条数 " + page.getTotalElements());
//        System.out.println("总页数 " + page.getTotalPages());
//        for (SystemOption ability : page.getContent()) {
//        System.out.println(ability);
//        }
//    }
}