package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.model.VChapterWorkList;
import edu.dlut.ssdut.abilityfosterplatform.service.ClassroomWorkService;
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
import java.util.List;

/**
 * @Author :zjk
 * @Date :Create in 21:01 2019-11-01
 * @Description 课堂作业控制类
 **/
@Api(tags = "ClassroomWorkController")
@RestController
@RequestMapping("/api/classroomwork")
public class ClassroomWorkController {
    @Autowired
    private StudentWorkService studentWorkService;
    @Autowired
    private ClassroomWorkService classroomWorkService;
    @ApiOperation("获取课堂下的章节作业")
    @GetMapping("/chapterlist")
    public ResultVO selectChapterWorkList(@RequestParam(value ="classroomId")Integer classroomId,
                                          @RequestParam(value = "chapterId")Integer chapterId){
        List<VChapterWorkList> list = classroomWorkService.selectChapterWorkList(classroomId, chapterId);
        if (list!=null){
        return ResultVOUtil.success(list);
        }
        else {
            return ResultVOUtil.error(400,"操作出错");
        }
    }

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
    @GetMapping("/revokelayout")
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
