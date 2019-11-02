package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.dto.TestPaperListDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.TestPaperListDetailDTO;
import edu.dlut.ssdut.abilityfosterplatform.repository.VTestPaperDetailRepository;
import edu.dlut.ssdut.abilityfosterplatform.service.TestPaperDetailService;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @Autowired
    private TestPaperDetailService testPaperDetailService;

//    @ApiOperation("试卷详情")
//    @GetMapping("/testpaperlist")
//    public ResultVO getTestPaperList(@RequestParam(value= "testPaperId") Integer testPaperId){
//        PageRequest request = PageRequest.of(0,99999, Sort.Direction.DESC, "detail_number");
//        Map<String,Object> map = new HashMap<String,Object>();
//
//        map.put("A",vTestPaperDetailRepository.findVTestPaperDetailByTestPaperIdAAndDetailType(testPaperId,1,request));
//        map.put("B",vTestPaperDetailRepository.findVTestPaperDetailByTestPaperIdAAndDetailType(testPaperId,2,request));
//        return ResultVOUtil.success(map);
//    }
    /**
     * @Author YuJunMing
     * @Date 2019/10/26 21:29
     * DESCRIPTION:
     */
    @ApiOperation("试卷详情")
    @GetMapping("/testpaperlist")
    public ResultVO getTestPaperList(@RequestParam(value= "testPaperId") Integer testPaperId){

        TestPaperListDTO testPaperListDTO = new TestPaperListDTO();
        List<TestPaperListDetailDTO> A= testPaperDetailService.getTestPaperDetailListA(testPaperId);
        List<TestPaperListDetailDTO> B= testPaperDetailService.getTestPaperDetailListB(testPaperId) ;
        testPaperListDTO.setA(A);
        testPaperListDTO.setB(B);

        return ResultVOUtil.success(testPaperListDTO);
    }

    
}
