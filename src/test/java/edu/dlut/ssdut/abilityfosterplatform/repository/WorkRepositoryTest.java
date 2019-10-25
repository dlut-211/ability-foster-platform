package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.Work;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class WorkRepositoryTest {

    @Autowired
    private WorkRepository workRepository;

    @Test
    public void findAllByChapterId() {
        List<Work> workList = workRepository.findAllByChapterId(1);
        workList.forEach(System.out::println);


    }
}