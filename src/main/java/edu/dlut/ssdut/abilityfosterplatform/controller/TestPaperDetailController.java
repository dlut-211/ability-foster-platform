package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @AUTHOR: lhd
 * @DATE: 2019/10/25
 * DESCRIPTION:
 **/
@Api(tags = "TestPaperDetailController")
@RestController
@RequestMapping("api/testpaperdetail")
public class TestPaperDetailController {

    @ApiOperation("试卷详情")
    @GetMapping("/testpaperlist")
    public ResultVO getTestPaperList(@RequestParam(value= "testPaperId") Integer testPaperId){

        return ResultVOUtil.success();
    }
}
