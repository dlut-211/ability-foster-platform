package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.VStudentWork;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class VStudentWorkRepositoryTest {
    @Autowired
    private VStudentWorkRepository vStudentWorkRepository;
    @Test
    public void findVStudentWorkByStudentId() {
        PageRequest request = PageRequest.of(0,5, Sort.Direction.DESC, "beginDate");
        Page<VStudentWork> page = vStudentWorkRepository.findVStudentWorkByStudentId(5001,request);
        page.getContent().forEach(System.out::println);
    }
}
