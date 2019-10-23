package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.VAvgStudentClassroomScore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VAvgStudentClassroomScoreRepositoryTest {

    @Autowired
    private VAvgStudentClassroomScoreRepository repository;

    @Test
    public void findAll() {
        PageRequest request = PageRequest.of(0, 5);
        Page<VAvgStudentClassroomScore> page = repository.findVAvgStudentClassroomScores(request);
        page.getContent().forEach(System.out::println);
    }

}