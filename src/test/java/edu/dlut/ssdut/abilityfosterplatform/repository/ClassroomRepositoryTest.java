package edu.dlut.ssdut.abilityfosterplatform.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClassroomRepositoryTest {

    @Autowired
    private ClassroomRepository classroomRepository;

    @Test
    public void findAllByCourseId() {
        classroomRepository.findAllByCourseId(2).forEach(System.out::println);
    }
}