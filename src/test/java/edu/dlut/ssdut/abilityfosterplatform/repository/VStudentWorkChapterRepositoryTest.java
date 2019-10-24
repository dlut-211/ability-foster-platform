package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.VStudentWorkChapter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
<<<<<<< HEAD:src/test/java/edu/dlut/ssdut/abilityfosterplatform/repository/VStudentclassroomabilityresultRepositoryTest.java
public class VStudentClassroomAbilityResultRepositoryTest {

    @Autowired
    private VStudentClassroomAbilityResultRepository repository;

    @Test
    public void findVStudentClassroomAbilityResults() {
        PageRequest request = PageRequest.of(0, 5);
        Page<VStudentClassroomAbilityResult> page = repository.findVStudentClassroomAbilityResults(request);
=======
public class VStudentWorkChapterRepositoryTest {

    @Autowired VStudentWorkChapterRepository vStudentWorkChapterRepository;

    @Test
    public void findVStudentWorkChapters() {
        PageRequest request = PageRequest.of(0,5);
        Page<VStudentWorkChapter> page = vStudentWorkChapterRepository.findVStudentWorkChapters(5001,45,16,request);
>>>>>>> cef1b66f9d3d38ca329f4898c2d50433d668f951:src/test/java/edu/dlut/ssdut/abilityfosterplatform/repository/VStudentWorkChapterRepositoryTest.java
        page.getContent().forEach(System.out::println);
    }
}