package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.Knowledge;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KnowledgeRepositoryTest {

    @Autowired
    private KnowledgeRepository repository;

    @Test
    public void findAllByCourseId() {
        List<Knowledge> knowledgeList = repository.findAllByCourseId(2);
        knowledgeList.forEach(System.out::println);
    }
}