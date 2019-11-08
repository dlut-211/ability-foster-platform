package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.TestPaperDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestPaperDetailRepositoryTest {

    @Autowired
    private TestPaperDetailRepository testPaperDetailRepository;
    @Test
    public void getCountByTestPaperId() {
        System.out.println(testPaperDetailRepository.getCountByTestPaperId(39));
    }

    @Test
    public void findByTestPaperId() {
        System.out.println(testPaperDetailRepository.findByTestPaperId(39));
    }

    @Test
    public void findAllByTestPaperIdAndDetailType() {
        List<TestPaperDetail> testPaperDetailList = testPaperDetailRepository.findAllByTestPaperIdAndDetailType(80, 1);
        testPaperDetailList.forEach(System.out::println);
    }
}
