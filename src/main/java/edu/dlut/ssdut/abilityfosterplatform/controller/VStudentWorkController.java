package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.dto.VCharterWorkDto;
import edu.dlut.ssdut.abilityfosterplatform.dto.VStudentWorkChapterDto;
import edu.dlut.ssdut.abilityfosterplatform.dto.VStudentWorkInfoDto;
import edu.dlut.ssdut.abilityfosterplatform.model.VChapterWorkZjk;
import edu.dlut.ssdut.abilityfosterplatform.model.VStudentWork;
import edu.dlut.ssdut.abilityfosterplatform.model.VStudentWorkChapter;
import edu.dlut.ssdut.abilityfosterplatform.service.VChapterWorkService;
import edu.dlut.ssdut.abilityfosterplatform.service.VStudentWorkService;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "VStudentWorkController")
@RestController
@RequestMapping("/api/classroomstudent")
public class VStudentWorkController {

    @Autowired
    private VStudentWorkService vStudentWorkService;

    @Autowired
    private VChapterWorkService vChapterWorkService;

    @ApiOperation("学生首页——通过学生Id获取所选课程信息")
    @GetMapping("/selectClassRoomCountById")
    public ResultVO VStudentWorkInfoPage(VStudentWorkInfoDto vStudentWorkInfoDto){
        PageRequest request=PageRequest.of(vStudentWorkInfoDto.getNowPage()-1,
                vStudentWorkInfoDto.getPageSize(),
                Sort.Direction.DESC,"begin_date");
        Page<VStudentWork> page = vStudentWorkService.VStudentWorkInfoPage(vStudentWorkInfoDto.getStudentId(),request);
        return ResultVOUtil.success(page);
    }

    @ApiOperation("学生页面—我的课堂—章节作业")
    @GetMapping("/chapterWorkList")
    public ResultVO VChapterWorkPage(VCharterWorkDto vCharterWorkDto){
        PageRequest request = PageRequest.of(vCharterWorkDto.getNowPage()-1,vCharterWorkDto.getPageSize());
        Page<VChapterWorkZjk> page = vChapterWorkService.VChapterWorkPage(vCharterWorkDto.getClassroomId(),vCharterWorkDto.getStudentId(),request);
        return ResultVOUtil.success(page);
    }

    @ApiOperation("学生页面—查看作业")
    @GetMapping("/studentworkbychapter")
    public ResultVO findVStudentWorkChapters(VStudentWorkChapterDto vStudentWorkChapterDto){
        PageRequest request = PageRequest.of(vStudentWorkChapterDto.getNowPage()-1,vStudentWorkChapterDto.getPageSize());
        Page<VStudentWorkChapter> page = vChapterWorkService.VStudentWorkChapterPage(vStudentWorkChapterDto.getStudentId(),
                vStudentWorkChapterDto.getChapterId(),vStudentWorkChapterDto.getClassroomId(),request);
        return ResultVOUtil.success(page);
    }
}
