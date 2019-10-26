package edu.dlut.ssdut.abilityfosterplatform.repository;


import edu.dlut.ssdut.abilityfosterplatform.model.TestPaper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestPaperRepositoryTest {

    @Autowired
    private TestPaperRepository testPaperRepository;

    @Test
    public void testFindById() {
        TestPaper testPaper = testPaperRepository.findById(5).orElse(null);
        Assert.assertNotNull(testPaper);
    }

    @Test
    public void findTestPapersByClassroomId(){
        PageRequest request = PageRequest.of(0,10);
        Page<TestPaper> page = testPaperRepository.findTestPapersByClassroomId(2,request);
        page.getContent().forEach(System.out::println);
    }
}
