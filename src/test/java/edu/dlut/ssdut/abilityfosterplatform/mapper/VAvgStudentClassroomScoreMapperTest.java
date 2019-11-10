package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.dto.NameAndAvgScoreDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
    @RunWith(SpringRunner.class)
    @SpringBootTest
    public class VAvgStudentClassroomScoreMapperTest {
        @Autowired
        private VAvgStudentClassroomScoreMapper vAvgStudentClassroomScoreMapper;
        @Autowired
        private VAvgClassroomScoreMapper vAvgClassroomScoreMapper;
        @Test
        public void selectAVgScore() {
            List<Float>list=vAvgStudentClassroomScoreMapper.selectAVgScore(5001);
            System.out.println(list);
        }
        @Test
        public void selectNameAndScore(){
            List<NameAndAvgScoreDTO> list = vAvgClassroomScoreMapper.selectNameAndScore(5001);
            System.out.println(list);
        }
    }
