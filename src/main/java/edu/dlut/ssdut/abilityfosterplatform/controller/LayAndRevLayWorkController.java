package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.service.StudentWorkService;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author :zjk
 * @Date :Create in 10:23 2019-10-26
 * @Description 布置作业控制类
 **/
@Api(tags = "LayAndRevLayWorkController")
@RestController
@RequestMapping("/api/studentwork")
public class LayAndRevLayWorkController {
    @Autowired
    private StudentWorkService studentWorkService;

    @GetMapping("/layoutwork")
    @ApiOperation("布置作业")
    public ResultVO LayoutWork(@RequestParam(value = "userId") Integer userId,
                               @RequestParam(value = "classroomWorkId") Integer classroomWorkId,
                               @RequestParam(value = "endTime") Date endTime) {
        int i = studentWorkService.layoutWork(userId, classroomWorkId, endTime);
        if (i == 200) {
            return ResultVOUtil.error(400, "此课程已结课,布置失败");
        }
        else if (i == 300) {
            return ResultVOUtil.error(400, "布置失败，请先导入学生");
        }
        else if (i == 1) {
            return ResultVOUtil.success("布置成功");
        }
        else if(i == 0){
            return ResultVOUtil.error(400,"布置失败，请重试");
        }
        else{
            return ResultVOUtil.error(400,"出现未知错误，请重试");
        }
    }
    @GetMapping("/revokelayoutwork")
    public ResultVO revokeLayoutWork(Integer classroomWorkId, Integer userId){
       int i= studentWorkService.revokeLayoutWork(classroomWorkId, userId);
       if (i==0){
           return ResultVOUtil.error(400,"撤销失败");
       }
       else if (i==1){
           return ResultVOUtil.success();
       }
       else {
           return ResultVOUtil.error(400, "发生未知错误");
       }

    }
}
