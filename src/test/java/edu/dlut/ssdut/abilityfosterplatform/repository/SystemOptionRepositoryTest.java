package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.SystemOption;
<<<<<<< HEAD
=======
import org.junit.Assert;
>>>>>>> 592701bbe98506b8e27d8676b4a27a3660357ae2
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
<<<<<<< HEAD
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

=======
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;


>>>>>>> 592701bbe98506b8e27d8676b4a27a3660357ae2
@RunWith(SpringRunner.class)
@SpringBootTest
public class SystemOptionRepositoryTest {

    @Autowired
<<<<<<< HEAD
    private SystemOptionRepository systemOptionRepository;


=======
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
>>>>>>> 592701bbe98506b8e27d8676b4a27a3660357ae2
}