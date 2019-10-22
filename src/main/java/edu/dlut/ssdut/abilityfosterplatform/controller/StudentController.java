package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.dto.LoginInfoDTO;
import edu.dlut.ssdut.abilityfosterplatform.service.StudentService;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "StudentController")
@RestController
@RequestMapping("/api/studentcontroller")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("selectByAccountAndPassword")
    public ResultVO selectByAccountAndPassword(LoginInfoDTO loginInfoDTO){
        loginInfoDTO.setPassword(DigestUtils.md5DigestAsHex(loginInfoDTO.getPassword().getBytes()));
        return ResultVOUtil.success(studentService.selectByAccountAndPassword(loginInfoDTO));
    }
}
