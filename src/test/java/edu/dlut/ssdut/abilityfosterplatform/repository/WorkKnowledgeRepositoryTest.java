package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.WorkKnowledge;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WorkKnowledgeRepositoryTest {

    @Autowired
    private WorkKnowledgeRepository repository;

    @Test
    public void findAllByWorkId() {
        List<WorkKnowledge> workKnowledgeList = repository.findAllByWorkId(64);
        workKnowledgeList.forEach(System.out::println);
        List<Integer> integerList = workKnowledgeList.stream().map(e -> e.getId()).collect(Collectors.toList());
        integerList.forEach(System.out::println);
    }

}