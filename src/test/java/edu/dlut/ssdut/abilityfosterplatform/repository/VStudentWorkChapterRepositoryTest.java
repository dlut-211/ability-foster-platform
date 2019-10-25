package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.VStudentWorkChapter;
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
public class VStudentWorkChapterRepositoryTest {

    @Autowired VStudentWorkChapterRepository vStudentWorkChapterRepository;

    @Test
    public void findVStudentWorkChapters() {
        PageRequest request = PageRequest.of(0,5);
        Page<VStudentWorkChapter> page = vStudentWorkChapterRepository.findVStudentWorkChapters(5001,45,16,request);
        page.getContent().forEach(System.out::println);
    }
}
