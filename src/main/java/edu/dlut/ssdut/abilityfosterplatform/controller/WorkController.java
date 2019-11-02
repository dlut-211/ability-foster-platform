package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.dto.ChapterWorkDTO;
import edu.dlut.ssdut.abilityfosterplatform.service.ChapterWorkService;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

/**
 * @AUTHOR: raymond
 * @DATE: 2019/10/25
 * DESCRIPTION:
 **/
@Api(tags = "WorkController")
@RestController
@RequestMapping("/api/work")
public class WorkController {

    @Autowired
    private ChapterWorkService chapterWorkService;

    @Autowired
    private Environment env;

    @ApiOperation("获取章节作业列表")
    @GetMapping("/list")
    public ResultVO list(@RequestParam("chapterId") Integer chapterId) {
        return ResultVOUtil.success(chapterWorkService.list(chapterId));
    }

    @ApiOperation("添加章节作业")
    @PostMapping("/add")
    public ResultVO addWork(ChapterWorkDTO chapterWorkDTO) {
        return ResultVOUtil.success(chapterWorkService.add(chapterWorkDTO));
    }

    @ApiOperation("编辑章节作业")
    @PutMapping("/edit")
    public ResultVO editWork(ChapterWorkDTO chapterWorkDTO) {
        return ResultVOUtil.success(chapterWorkService.edit(chapterWorkDTO));
    }

    @ApiOperation("删除章节作业")
    @DeleteMapping("/remove")
    public ResultVO removeWork(@RequestParam(value = "id", defaultValue = "") Integer id) {
        chapterWorkService.remove(id);
        return ResultVOUtil.success();
    }

}
