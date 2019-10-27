package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.service.VStudentWorkDetailService;
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
@Api(tags = "StudentWorkDetailController")
@RestController
@RequestMapping("/api/studentworkdetail")
public class StudentWorkDetailController {

    @Autowired
    private VStudentWorkDetailService vStudentWorkDetailService;

    @ApiOperation("按照学生作业ID获取学生作业列表")
    @GetMapping("/list")
    public ResultVO list(@RequestParam("studentWorkId") Integer studentWorkId) {
        return ResultVOUtil.success(vStudentWorkDetailService.findAllByStudentWorkId(studentWorkId));
    }
}
