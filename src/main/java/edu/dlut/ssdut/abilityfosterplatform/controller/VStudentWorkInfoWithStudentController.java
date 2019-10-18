package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.model.StudentWorkInfoWithStudentDto;
import edu.dlut.ssdut.abilityfosterplatform.model.VStudentworkinfowithstudent;
import edu.dlut.ssdut.abilityfosterplatform.service.VStudentWorkInfoWithStudentService;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Api(tags = "VStudentWorkInfoWithStudentController")
@RestController
@RequestMapping("/api/vstudentworkinfowithstudentcontroller")
public class VStudentWorkInfoWithStudentController {
    @Autowired
    private VStudentWorkInfoWithStudentService vStudentWorkInfoWithStudentService;
    @RequestMapping("/getStudentWorkInfoWithStudent")
    public ResultVO getStudentWorkInfoWithStudent( StudentWorkInfoWithStudentDto swiwDto){
        swiwDto.setStartSize((swiwDto.getNowPage()-1)*swiwDto.getPageSize());
        return ResultVOUtil.success(vStudentWorkInfoWithStudentService.getStudentWorkInfoWithStudent(swiwDto)) ;
    }
    @RequestMapping("/getallworkinfodata")
    public ResultVO getAllWorkInfoData(Integer studentId){
        return ResultVOUtil.success(vStudentWorkInfoWithStudentService.getAllWorkInfoData(studentId));
    }
}
