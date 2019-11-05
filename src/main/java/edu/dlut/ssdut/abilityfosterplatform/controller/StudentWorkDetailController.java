package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.model.StudentWorkDetail;
import edu.dlut.ssdut.abilityfosterplatform.service.VStudentWorkDetailService;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.PageRequest;
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
    public ResultVO list(@RequestParam("studentWorkId") Integer studentWorkId,
                         @RequestParam(value = "page", defaultValue = "1") Integer page,
                         @RequestParam(value = "limit", defaultValue = "10") Integer limit
                         ) {
        PageRequest request = PageRequest.of(page - 1, limit);
        return ResultVOUtil.success(vStudentWorkDetailService.findAllByStudentWorkId(studentWorkId, request));
    }

    @ApiOperation("增加学生作业细节")
    @PostMapping("/add")
    public ResultVO add(StudentWorkDetail studentWorkDetail){

        int i=vStudentWorkDetailService.insert(studentWorkDetail);
        System.out.println(studentWorkDetail);
        if (i==1)
            return ResultVOUtil.success();
        else
            return ResultVOUtil.error(400, "上传作业错误");
    }
}
