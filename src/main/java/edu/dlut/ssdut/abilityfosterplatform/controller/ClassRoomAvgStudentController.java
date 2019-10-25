package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.dto.NameAndAvgScoreDTO;
import edu.dlut.ssdut.abilityfosterplatform.mapper.VAvgClassroomScoreMapper;
import edu.dlut.ssdut.abilityfosterplatform.mapper.VAvgStudentClassroomScoreMapper;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author :zjk
 * @Date :Create in 19:58 2019-10-23
 * @Description 获取课程平均分，个人分数
 **/
@Api(tags = "ClassRoomAvgStudentController")
@RestController
@RequestMapping("/api/classroom")
public class ClassRoomAvgStudentController {
    @Autowired
    private VAvgClassroomScoreMapper vAvgClassroomScoreMapper;
    @Autowired
    private VAvgStudentClassroomScoreMapper vAvgStudentClassroomScoreMapper;
    @GetMapping("/classRoomAvgScore")
    @ApiOperation("获取学生个人成绩与课程平均分")
    public ResultVO getclassRoomAvgScore(Integer studentId){
        System.out.println("进来了");
        List<Float> studentAvgScoreList = vAvgStudentClassroomScoreMapper.selectAVgScore(studentId);
        List<NameAndAvgScoreDTO> classroomAvgScore = vAvgClassroomScoreMapper.selectNameAndScore(studentId);
        for (Float aFloat : studentAvgScoreList) {
            System.out.println(aFloat);
        }
        for (int i = 0; i < classroomAvgScore.size(); i++) {
            classroomAvgScore.get(i).setMyAvgScore(studentAvgScoreList.get(i));
        }
        return ResultVOUtil.success(classroomAvgScore);
    }
}
