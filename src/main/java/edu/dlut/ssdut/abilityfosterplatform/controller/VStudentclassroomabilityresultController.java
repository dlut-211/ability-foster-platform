package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.dto.VStudentWorkInfoDto;
import edu.dlut.ssdut.abilityfosterplatform.model.VStudentClassroomAbilityResult;
import edu.dlut.ssdut.abilityfosterplatform.service.VStudentclassroomabilityresultService;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "VStudentclassroomabilityresultPage")
@RestController
@RequestMapping("/api/vstudentclroabilityrscontroller")
public class VStudentclassroomabilityresultController {
    @Autowired
    private VStudentclassroomabilityresultService vsrs;

    @RequestMapping("/pageresult")
    public ResultVO VStudentclassroomabilityresultPage(VStudentWorkInfoDto vsdto) {
        System.out.println("hahah");
        PageRequest request = PageRequest.of(vsdto.getNowPage() - 1, vsdto.getPageSize());
        Page<VStudentClassroomAbilityResult> page = vsrs.VStudentclassroomabilityresultPage(vsdto.getStudentId(),request);
        return ResultVOUtil.success(page);
    }
}
