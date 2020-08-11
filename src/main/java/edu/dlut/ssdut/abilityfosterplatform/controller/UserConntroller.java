package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.dto.LoginInfoDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.UpdatePasswordDTO;
import edu.dlut.ssdut.abilityfosterplatform.model.User;
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
        User user = userService.selectByAccountAndPassword(loginInfoDTO);
        if (user != null) {
            return ResultVOUtil.success(user);
        }
        return ResultVOUtil.error(101, "账号或密码错误");

    }
    @RequestMapping("editpassword")
    public ResultVO editPassword(UpdatePasswordDTO updatePasswordDTO){
        int i = userService.updatePassword(updatePasswordDTO);
        if (i==0){
            return ResultVOUtil.error(0, "修改失败，请重试");
        }
        else if(i==400){
            return ResultVOUtil.error(400, "原始密码错误，请重试");
        }
        else {
            return ResultVOUtil.success();
        }
    }
}
