package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.VStudentClassroomAbilityResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VStudentClassroomAbilityResultRepositoryTest {

    @Autowired
    private VStudentClassroomAbilityResultRepository repository;

    @Test
    public void findVStudentClassroomAbilityResults() {
        PageRequest request = PageRequest.of(0, 5);
        Page<VStudentClassroomAbilityResult> page = repository.findVStudentClassroomAbilityResults(5001,request);
        page.getContent().forEach(System.out::println);
    }
}
