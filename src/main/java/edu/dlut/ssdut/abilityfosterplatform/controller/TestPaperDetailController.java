package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.model.VTestPaperDetail;
import edu.dlut.ssdut.abilityfosterplatform.repository.VTestPaperDetailRepository;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @AUTHOR: lhd
 * @DATE: 2019/10/25
 * DESCRIPTION:
 **/
@Api(tags = "TestPaperDetailController")
@RestController
@RequestMapping("api/testpaperdetail")
public class TestPaperDetailController {

    @Autowired
    private VTestPaperDetailRepository vTestPaperDetailRepository;

    @ApiOperation("试卷详情")
    @GetMapping("/testpaperlist")
    public ResultVO getTestPaperList(@RequestParam(value= "testPaperId") Integer testPaperId){
        PageRequest request = PageRequest.of(0,99999, Sort.Direction.DESC, "detail_number");
        Map<String,Object> map = new HashMap<String,Object>();

        map.put("A",vTestPaperDetailRepository.findVTestPaperDetailByTestPaperIdAAndDetailType(testPaperId,1,request));
        map.put("B",vTestPaperDetailRepository.findVTestPaperDetailByTestPaperIdAAndDetailType(testPaperId,2,request));
        return ResultVOUtil.success(map);
    }
}
