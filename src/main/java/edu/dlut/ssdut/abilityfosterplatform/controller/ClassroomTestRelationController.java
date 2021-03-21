package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.enums.ResultEnum;
import edu.dlut.ssdut.abilityfosterplatform.model.KnowledgeTest;
import edu.dlut.ssdut.abilityfosterplatform.service.ClassroomTestRelationService;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/classroomTestRelation")
public class ClassroomTestRelationController {
    @Autowired
    ClassroomTestRelationService classroomTestRelationService;

    /**
     * 根据章节 Id 和课堂 Id 来查找布置的试题
     * @param chapterId
     * @param classroomId
     * @return
     */
    @GetMapping("/getAllTest")
    public ResultVO getAllTestById(int chapterId, int classroomId) {
        List<KnowledgeTest> testList = classroomTestRelationService.getALlTestById(chapterId, classroomId);
        return ResultVOUtil.success(testList);
    }

    @ApiOperation("发布随堂作业")
    @PutMapping("/updateToOne")
    public ResultVO layoutClassWork(int classroomId, int knowledgeTestId) {
        Integer result = classroomTestRelationService.layoutClassWork(classroomId, knowledgeTestId);
        if (result.equals(ResultEnum.SUCCESS.getCode())) {
            return ResultVOUtil.success("删除成功");
        } else {
            return ResultVOUtil.error(result, "请先结束上次布置的测试题目！");
        }
    }

    @ApiOperation("结束随堂作业")
    @PutMapping("/rollback")
    public ResultVO rollback(int classroomId, int knowledgeTestId) {
        return ResultVOUtil.success(classroomTestRelationService.rollback(classroomId, knowledgeTestId));
    }


}
