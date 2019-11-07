package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.dto.ChapterDTO;
import edu.dlut.ssdut.abilityfosterplatform.service.ChapterService;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Api(tags = "ChapterController")
@RestController
@RequestMapping("/api/chapter")
public class ChapterController {

    @Autowired
    private ChapterService chapterService;

    @ApiOperation("获取课程主章节列表")
    @GetMapping(value = "/findChapterByCourseId" )
    public ResultVO findChapterByCourseId(@RequestParam("id") Integer id) {
        List<ChapterDTO> chapterDTOList = chapterService.findByCourseId(id);
//        List<ChapterDTO> chapterDTOList1=new ArrayList<>();
//        for (int i = 0; i < chapterDTOList.size(); i++) {
//            if(chapterDTOList.get(i).getChapterLevel()==1){
//                chapterDTOList1.add(chapterDTOList.get(i)) ;
//            }
//        }

        return ResultVOUtil.success(chapterDTOList);
    }

    @ApiOperation("获取课程章节")
    @GetMapping(value = "/courselist" )
    public ResultVO courseList(@RequestParam("id")Integer id){
        List<ChapterDTO> chapterDTOList = chapterService.findByCourseId(id);
        return ResultVOUtil.success(chapterDTOList);
    }

    @ApiOperation("获取章节树")
    @GetMapping("/tree")
    public ResultVO getChapterTree(@RequestParam("courseId") Integer courseId) {
        return ResultVOUtil.success(chapterService.getChapterTree(courseId));
    }

    @ApiOperation("添加章节")
    @PostMapping("/add")
    public ResultVO addChapter(ChapterDTO chapterDTO) {
        return ResultVOUtil.success(chapterService.add(chapterDTO));
    }

    @ApiOperation("编辑章节")
    @PutMapping("/edit")
    public ResultVO editChapter(ChapterDTO chapterDTO) {
        return ResultVOUtil.success(chapterService.edit(chapterDTO));
    }

    @ApiOperation("删除章节")
    @DeleteMapping("/remove")
    public ResultVO removeChapter(@RequestParam("id") Integer id) {
        chapterService.delete(id);
        return ResultVOUtil.success();
    }

}
