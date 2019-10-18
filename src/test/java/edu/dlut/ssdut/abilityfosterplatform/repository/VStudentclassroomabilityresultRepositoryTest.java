package edu.dlut.ssdut.abilityfosterplatform.Repository;

import edu.dlut.ssdut.abilityfosterplatform.model.VStudentclassroomabilityresult;
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
public class VStudentclassroomabilityresultRepositoryTest {
    @Autowired
    private VStudentclassroomabilityresultRepository vsre;
    @Test
    public void findVStudentclassroomabilityresultsByStudentid() {
        PageRequest request = PageRequest.of(0,5);
        Page<VStudentclassroomabilityresult> page = vsre.findVStudentclassroomabilityresultsByStudentid(5001, request);
        System.out.println("hahhahahah");
        System.out.println("数据总数"+page.getTotalElements());
    }
}
