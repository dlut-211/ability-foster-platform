package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.dto.ChapterDTO;
import edu.dlut.ssdut.abilityfosterplatform.service.ChapterService;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "ChapterController")
@RestController
@RequestMapping("/api/chapter")
public class ChapterController {

    @Autowired
    private ChapterService chapterService;

    @RequestMapping(value = "/findChapterByCourseId" , method = RequestMethod.GET)
    public ResultVO findChapterByCourseId(Integer id) {
        List<ChapterDTO> chapterDTOList = chapterService.findByCourseId(id);
        return ResultVOUtil.success(chapterDTOList);
    }

}
