package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.dto.TestPaperDTO;
import edu.dlut.ssdut.abilityfosterplatform.enums.ResultEnum;
import edu.dlut.ssdut.abilityfosterplatform.model.TestPaper;
import edu.dlut.ssdut.abilityfosterplatform.service.TestPaperService;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

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

    @ApiOperation("试卷列表")
    @GetMapping("/list")
    public ResultVO TestPaperPage(@RequestParam(value = "page") int page,
                                  @RequestParam(value = "pageSize")int pageSize,
                                  @RequestParam(value = "classroomId")Integer classroomId){
        PageRequest request = PageRequest.of(page,pageSize);
        Page<TestPaper> Testlist = testPaperService.TestPaperPage(classroomId,request);
        return ResultVOUtil.success(Testlist);
    }

    @ApiOperation("试卷删除")
    @DeleteMapping("/remove")
    public ResultVO removeTestPaper(@RequestParam(value = "testPaperId")Integer testPaperId){
        testPaperService.remove(testPaperId);
        return ResultVOUtil.success();
    }
}
