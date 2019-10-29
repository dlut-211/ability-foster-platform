package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.dto.LoginInfoDTO;
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
public class UserConntroller {
    @Autowired
    private UserService userService;
    @RequestMapping("selectByAccountAndPassword")
    public ResultVO selectByAccountAndPassword(LoginInfoDTO loginInfoDTO){
        loginInfoDTO.setPassword(DigestUtils.md5DigestAsHex(loginInfoDTO.getPassword().getBytes()));
        return ResultVOUtil.success(userService.selectByAccountAndPassword(loginInfoDTO));
    }
}
