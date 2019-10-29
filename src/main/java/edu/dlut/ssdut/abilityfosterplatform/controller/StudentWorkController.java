package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.service.VStudentWorkService;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @AUTHOR: raymond
 * @DATE: 2019/10/27
 * DESCRIPTION:
 **/
@Api(tags = "StudentWorkController")
@RestController
@RequestMapping("/api/studentwork")
public class StudentWorkController {

    @Autowired
    private VStudentWorkService vStudentWorkService;

    @ApiOperation("作业列表")
    @GetMapping("/worklist")
    public ResultVO workList(@RequestParam("classroomWorkId") Integer classroomWorkId) {
        return ResultVOUtil.success(vStudentWorkService.findStudentWork(classroomWorkId));
    }
}