package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.model.KnowledgeTest;
import edu.dlut.ssdut.abilityfosterplatform.service.KnowledgeTestService;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: Wdz
 * @Date 2021/3/12 16:55
 * @Description:
 */

@Api(tags = "KnowledgeTestController")
@RestController
@RequestMapping("/api/knowledgetest")
public class KnowledgeTestController {

    @Autowired
    private KnowledgeTestService knowledgeTestService;


    @ApiOperation("添加课堂作业")
    @PostMapping("/add")
    public ResultVO addKnowledge(KnowledgeTest knowledgeTest) {
        return ResultVOUtil.success(knowledgeTestService.add(knowledgeTest));
    }

    @ApiOperation("根据章节id查询随堂作业")
    @GetMapping("/list")
    public ResultVO getKnowledgeByChapterId(@RequestParam("chapterId") Integer chapterId,@RequestParam("courseId") Integer courseId) {
        return ResultVOUtil.success(knowledgeTestService.list(courseId, chapterId));
    }

    @ApiOperation("编辑课堂作业")
    @PutMapping("/edit")
    public ResultVO editWork(KnowledgeTest knowledgeTest) {
        return ResultVOUtil.success(knowledgeTestService.edit(knowledgeTest));
    }

    @ApiOperation("删除课堂作业")
    @DeleteMapping("/delect")
    public ResultVO removeWork(@RequestParam(value = "id", defaultValue = "") Long id) {
        knowledgeTestService.delect(id);
        return ResultVOUtil.success();
    }

    @ApiOperation("根据courseId和knowledgeId去获取树形展示信息")
    @GetMapping("/findByCourseIdAndKnowledgeId")
    public ResultVO findTreeInfo(@RequestParam("courseId") Integer courseId, @RequestParam("knowledgeId") Integer knowledgeId) {
        return ResultVOUtil.success(knowledgeTestService.findTreeInfo(courseId, knowledgeId));
    }

    @ApiOperation("根据课堂classroomId和章节chapterId去获取课堂作业信息")
    @GetMapping("/findClassInfo")
    public ResultVO findClassWorkInfo(@RequestParam("classroomId") Integer classroomId, @RequestParam("chapterId") Integer chapterId) {
        return ResultVOUtil.success(knowledgeTestService.findClassWorkInfo(classroomId, chapterId));
    }

}
