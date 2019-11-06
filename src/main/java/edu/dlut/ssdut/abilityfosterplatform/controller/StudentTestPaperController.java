package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.dto.PStudentTestPaperDTO;
import edu.dlut.ssdut.abilityfosterplatform.repository.TestPaperDetailRepository;
import edu.dlut.ssdut.abilityfosterplatform.repository.VStudentTestPaperRepository;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @AUTHOR: lhd
 * @DATE: 2019/10/26
 * DESCRIPTION:
 **/
@Api(tags = "StudentTestPaperController")
@RestController
@RequestMapping("api/studenttestpaper")
public class StudentTestPaperController {

    @Autowired
    private TestPaperDetailRepository testPaperDetailRepository;

    @Autowired
    private VStudentTestPaperRepository vStudentTestPaperRepository;


    @ApiOperation("学生考试成绩")
    @GetMapping("/testpaperlist")
    public ResultVO getTestPaperList(@RequestParam(value= "testPaperId") Integer testPaperId){
        int length = testPaperDetailRepository.getCountByTestPaperId(testPaperId);//每条记录题个数
        int count = vStudentTestPaperRepository.getCountStudentTestPaper(testPaperId);//记录条数
        List<PStudentTestPaperDTO> pStudentTestPaperDTOS = vStudentTestPaperRepository.getVStudentTestPapersByTestPaperId(testPaperId);
        int[][] score = new int[length][count];
        for(int j=0;j<length;j++){
            score[j] = vStudentTestPaperRepository.getScoreByDAndDetailNumberAndTestPaperId(j+1,testPaperId);
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

        return ResultVOUtil.success(data);
    }

}
