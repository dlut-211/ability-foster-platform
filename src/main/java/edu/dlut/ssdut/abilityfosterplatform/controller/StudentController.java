package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.model.LoginInfo;
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
    @RequestMapping("/selectByAccountAndPassword")
    public ResultVO selectByAccountAndPassword(LoginInfo loginInfo){
        loginInfo.setPassword(DigestUtils.md5DigestAsHex(loginInfo.getPassword().getBytes()));
        return ResultVOUtil.success(studentService.selectByAccountAndPassword(loginInfo));
    }
}
