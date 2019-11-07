package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.dto.PStudentTestPaperDTO;
import edu.dlut.ssdut.abilityfosterplatform.repository.TestPaperDetailRepository;
import edu.dlut.ssdut.abilityfosterplatform.repository.VStudentTestPaperRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentTestPaperServiceTest {
    @Autowired
    private VStudentTestPaperRepository vStudentTestPaperRepository;

    @Autowired
    private TestPaperDetailRepository testPaperDetailRepository;

    @Test
    public void insertStudentTestPaper() {
        int length = testPaperDetailRepository.getCountByTestPaperId(77);//每条记录题个数
        int count = vStudentTestPaperRepository.getCountStudentTestPaper(7);//记录条数
        System.out.println(count);
        List<PStudentTestPaperDTO> pStudentTestPaperDTOS = vStudentTestPaperRepository.getVStudentTestPapersByTestPaperId(77);
        int[][] score = new int[length][count];
        for(int j=0;j<length;j++){
            score[j] = vStudentTestPaperRepository.getScoreByDAndDetailNumberAndTestPaperId(j+1,77);
        }
        Map[] list = new Map[count];
        for(int i=0;i<count;i++){
            int totalScore = 0;
            list[i] = new HashMap<String,Object>();
            System.out.println(count);
            System.out.println(i);
            PStudentTestPaperDTO temp = (PStudentTestPaperDTO)pStudentTestPaperDTOS.toArray()[i];
            System.out.println(temp);
            list[i].put("studentNumber", temp.getStudentNumber());
            list[i].put("studentName", temp.getStudentName());
            list[i].put("testPaperId", temp.getTestPaperId());
            list[i].put("detailType", temp.getDetailType());
            for(int j = 0;j<length;j++){
                list[i].put(j+1 ,score[j][i]);
                totalScore+=score[j][i];
            }
            list[i].put("totalScore",totalScore);
        }
        Map data = new HashMap();
        data.put("total",count);
        data.put("list",list);
    }
}