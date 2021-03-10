package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.dto.CourseAKDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.KnowledgeAbilityDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.TreeDTO;
import edu.dlut.ssdut.abilityfosterplatform.service.KnowledgeService;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: raymond
 * @Date: 2019/10/24 15:54
 * @Description: 知识点操作 控制层
 **/
@Api(tags = "KnowledgeController")
@RestController
@RequestMapping("/api/knowledge")
public class KnowledgeController {

    @Autowired
    private KnowledgeService knowledgeService;

    @ApiOperation("获取知识点列表 - 不分页")
    @GetMapping("/list")
    public ResultVO getKnowledgeList(@RequestParam(value = "courseId", defaultValue = "") Integer courseId) {
        return ResultVOUtil.success(knowledgeService.findKnowledgeDTOList(courseId));
    }

    @ApiOperation("获取知识点列表 - 分页")
    @GetMapping("/page")
    public ResultVO getKnowledgePage(@RequestParam(value = "courseId", defaultValue = "") Integer courseId,
                                     @RequestParam(value = "page", defaultValue = "1") Integer page,
                                     @RequestParam(value = "limit", defaultValue = "10") Integer limit) {
        PageRequest request = PageRequest.of(page - 1, limit);
        return ResultVOUtil.success(knowledgeService.findKnowledgeDTOByPage(courseId, request));
    }

    @ApiOperation("添加知识点")
    @PostMapping("/add")
    public ResultVO addKnowledge(KnowledgeAbilityDTO knowledgeAbilityDTO) {
        return ResultVOUtil.success(knowledgeService.add(knowledgeAbilityDTO));
    }

    @ApiOperation("修改知识点")
    @PutMapping("/edit")
    public ResultVO editKnowledge(KnowledgeAbilityDTO knowledgeAbilityDTO) {
        return ResultVOUtil.success(knowledgeService.edit(knowledgeAbilityDTO));
    }

    @ApiOperation("删除知识点")
    @DeleteMapping("/remove")
    public ResultVO removeKnowledge(@RequestParam("id") Integer id) {
        knowledgeService.remove(id);
        return ResultVOUtil.success();
    }

    @ApiOperation("树形图")
    @GetMapping("/courseAKTree")
    public ResultVO courseAKTree(@RequestParam("courseId") Integer courseId) {
        TreeDTO tree = knowledgeService.courseAKTree(courseId);
        return ResultVOUtil.success(tree);
    }
}
