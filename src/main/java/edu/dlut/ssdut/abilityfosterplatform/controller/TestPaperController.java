package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.dto.TestPaperDTO;
import edu.dlut.ssdut.abilityfosterplatform.enums.ResultEnum;
import edu.dlut.ssdut.abilityfosterplatform.service.TestPaperService;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @AUTHOR: raymond
 * @DATE: 2019/10/20
 * DESCRIPTION:
 **/
@Api(tags = "TestPaperController")
@RestController
@RequestMapping("/api/test_paper")
public class TestPaperController {

    @Autowired
    private TestPaperService testPaperService;

    @ApiOperation("添加试卷")
    @PostMapping("/add")
    public ResultVO addTestPaper(@RequestBody TestPaperDTO testPaperDTO) {
        Boolean addResult = testPaperService.addTestPaper(testPaperDTO);
        if (addResult) {
            return ResultVOUtil.success();
        } else {
            return ResultVOUtil.error(ResultEnum.ADD_TEST_PAPER_FAIL.getCode(), ResultEnum.ADD_TEST_PAPER_DETAIL_FAIL.getMessage());
        }

    }

}
