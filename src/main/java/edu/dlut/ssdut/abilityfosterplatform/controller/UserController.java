package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.model.LoginInfo;
import edu.dlut.ssdut.abilityfosterplatform.model.Student;
import edu.dlut.ssdut.abilityfosterplatform.service.StudentService;
import edu.dlut.ssdut.abilityfosterplatform.service.UserService;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "UserController")
@RestController
@RequestMapping("/api/usercontroller")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/selectByAccountAndPassword")
    public ResultVO selectByAccountAndPassword(LoginInfo loginInfo){
       loginInfo.setPassword(DigestUtils.md5DigestAsHex(loginInfo.getPassword().getBytes()));
        return ResultVOUtil.success(userService.selectByAccountAndPassword(loginInfo));
    }
}
