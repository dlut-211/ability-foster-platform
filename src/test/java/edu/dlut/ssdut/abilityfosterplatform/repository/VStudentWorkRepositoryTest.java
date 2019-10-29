package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.converter.TimeFormatConverter;
import edu.dlut.ssdut.abilityfosterplatform.model.VClassroomStudentInfo;
import edu.dlut.ssdut.abilityfosterplatform.model.VStudentWork;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class VStudentWorkRepositoryTest {

    @Autowired
    private VClassroomStudentInfoRepository vClassroomStudentInfoRepository;
    @Test
    public void findVStudentWorkByStudentId() {
        PageRequest request = PageRequest.of(0,5, Sort.Direction.DESC, "begin_date");
        Page<VClassroomStudentInfo> page = vClassroomStudentInfoRepository.findVStudentWorkByStudentId(5001,request);
        page.getContent().forEach(System.out::println);
    }

    @Autowired
    private VStudentWorkRepository vStudentWorkRepository;

    @Test
    public void list() {
        vStudentWorkRepository.findAllByClassroomWorkId(82).forEach(System.out::println);
    }

    @Test
    public void sumScore() {
        System.out.println(vStudentWorkRepository.sumScore(82));
    }

    @Test
    public void timeFormat() {
        System.out.println(TimeFormatConverter.second2DHMS((long) 110835));
    }

    @Test
    public void getSubmitCount() {
        System.out.println(vStudentWorkRepository.getSubmitCount(82));
    }

    @Test
    public void getScoreCount() {
        System.out.println(vStudentWorkRepository.getScoreCount(82));
    }

    @Test
    public void countByClassroomStudentId() {
        System.out.println(vStudentWorkRepository.countByClassroomWorkId(82));
    }
}
