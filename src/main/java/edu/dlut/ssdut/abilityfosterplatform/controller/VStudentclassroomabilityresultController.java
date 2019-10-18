package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.model.StudentWorkInfoWithStudentDto;
import edu.dlut.ssdut.abilityfosterplatform.model.VStudentclassroomabilityresult;
import edu.dlut.ssdut.abilityfosterplatform.service.VStudentclassroomabilityresultService;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "VStudentclassroomabilityresultPage")
@RestController
@RequestMapping("/api/vstudentclroabilityrscontroller")
public class VStudentclassroomabilityresultController {
    @Autowired
    private VStudentclassroomabilityresultService vsrs;

    @RequestMapping("/pageresult")
    public ResultVO VStudentclassroomabilityresultPage(StudentWorkInfoWithStudentDto sidto) {
        PageRequest request = PageRequest.of(sidto.getNowPage() - 1, sidto.getPageSize());
        Page<VStudentclassroomabilityresult> page = vsrs.VStudentclassroomabilityresultPage(sidto.getStudentId(), request);
        return ResultVOUtil.success(page);
    }
}
