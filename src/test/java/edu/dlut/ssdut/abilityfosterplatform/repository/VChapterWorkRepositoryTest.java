package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.VChapterWork;
import edu.dlut.ssdut.abilityfosterplatform.model.VChapterWorkZjk;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VChapterWorkRepositoryTest {

    @Autowired
    private VChapterWorkRepository repository;

    @Test
    public void findVChapterWorkZjks() {
        PageRequest request = PageRequest.of(0, 5);
        List<VChapterWorkZjk> page = repository.findVChapterWorkZjks(18, 5001,0,5);
        //page.getContent().forEach(System.out::println);
    }
}
