package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.VStudentWork;
import edu.dlut.ssdut.abilityfosterplatform.model.VTestPaperDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class VTestPaperDetailRepositoryTest {

    @Autowired
    private VTestPaperDetailRepository vTestPaperDetailRepository;
    @Test
    public void findVTestPaperDetails() {
        PageRequest request = PageRequest.of(0, 100);
        Page<VTestPaperDetail> page = vTestPaperDetailRepository.findVTestPaperDetailByTestPaperIdAAndDetailType(39,1,request);
        page.getContent().forEach(System.out::println);
    }
}