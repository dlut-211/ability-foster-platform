package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.model.LoginInfo;
import edu.dlut.ssdut.abilityfosterplatform.model.Teacher;
import edu.dlut.ssdut.abilityfosterplatform.service.TeacherService;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Api(tags = "TeacherController")
@RestController
@RequestMapping("/api/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @ApiOperation("教师登录")
    @RequestMapping(value = "/selectByAccountAndPassword", method = RequestMethod.GET)
    public ResultVO selectByAccountAndPassword(LoginInfo loginInfo, HttpServletRequest request){
        loginInfo.setPassword(DigestUtils.md5DigestAsHex(loginInfo.getPassword().getBytes()));
        Teacher teacher = teacherService.selectByAccountAndPassword(loginInfo);
        request.getSession().setAttribute("username", teacher.getName());
        return ResultVOUtil.success(teacher);
    }
}
