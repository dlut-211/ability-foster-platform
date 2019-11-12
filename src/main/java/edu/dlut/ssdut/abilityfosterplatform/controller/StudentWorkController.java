package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.model.StudentWork;
import edu.dlut.ssdut.abilityfosterplatform.service.StudentWorkService;
import edu.dlut.ssdut.abilityfosterplatform.service.VStudentWorkService;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @Autowired
    private StudentWorkService studentWorkService;

    @ApiOperation("作业列表")
    @GetMapping("/worklist")
    public ResultVO workList(@RequestParam("classroomWorkId") Integer classroomWorkId) {
        return ResultVOUtil.success(vStudentWorkService.findStudentWork(classroomWorkId));
    }

    @ApiOperation("作业评分")
    @PutMapping("/edit")
    public ResultVO mark(StudentWork studentWork){
        int i = studentWorkService.updateByPrimaryKey(studentWork);
        if (i==0){
            return ResultVOUtil.error(400, "评分失败");
        }
        else {
            return ResultVOUtil.success();
        }
    }
}
