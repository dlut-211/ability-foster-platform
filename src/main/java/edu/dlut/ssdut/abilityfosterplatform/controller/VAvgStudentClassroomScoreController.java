package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.model.VAvgStudentClassroomScore;
import edu.dlut.ssdut.abilityfosterplatform.service.VAvgStudentClassroomScoreService;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: raymond
 * @Date 2019/10/22 15:46
 * @Description: VAvgStudentClassroomScore 控制层
 **/
@Api(tags = "AdminController")
@ResponseBody
@RequestMapping("/api/admin")
public class VAvgStudentClassroomScoreController {

    @Autowired
    private VAvgStudentClassroomScoreService vAvgStudentClassroomScoreService;

    @GetMapping("/list/rank")
    @ApiOperation("展示各班学生成绩及排名")
    public ResultVO findRankList(@RequestParam(value = "page", defaultValue = "1") Integer page,
                                 @RequestParam(value = "size", defaultValue = "5") Integer size) {
        PageRequest request = PageRequest.of(page, size);
        Page<VAvgStudentClassroomScore> vAvgStudentClassroomScorePage = vAvgStudentClassroomScoreService.findVAvgStudentClassroomScores(request);
        return ResultVOUtil.success(vAvgStudentClassroomScorePage);
    }
//    @GetMapping("")
//    @ApiOperation("展示课程平均成绩与个人成绩")
//    public ResultVO
}
