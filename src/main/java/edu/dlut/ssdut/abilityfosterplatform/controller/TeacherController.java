package edu.dlut.ssdut.abilityfosterplatform.controller;


import edu.dlut.ssdut.abilityfosterplatform.dto.LoginInfoDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.SchoolTeacherDTO;
import edu.dlut.ssdut.abilityfosterplatform.enums.ResultEnum;
import edu.dlut.ssdut.abilityfosterplatform.exception.PlatformException;
import edu.dlut.ssdut.abilityfosterplatform.model.*;
import edu.dlut.ssdut.abilityfosterplatform.repository.SchoolRepository;
import edu.dlut.ssdut.abilityfosterplatform.repository.SystemOptionRepository;
import edu.dlut.ssdut.abilityfosterplatform.repository.TeacherRepository;
import edu.dlut.ssdut.abilityfosterplatform.repository.VSchoolTeacherRepository;
import edu.dlut.ssdut.abilityfosterplatform.service.TeacherService;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.util.DigestUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.*;


@Api(tags = "TeacherController")
@RestController
@RequestMapping("/api/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @Autowired
    private TeacherRepository teacherRepository;
    @Autowired
    private VSchoolTeacherRepository vSchoolTeacherRepository;
    @Autowired
    private SchoolRepository schoolRepository;

    @ApiOperation("教师登录")
    @RequestMapping(value = "/selectByAccountAndPassword", method = RequestMethod.GET)
    public ResultVO selectByAccountAndPassword(LoginInfo loginInfo, HttpServletRequest request) {

        loginInfo.setPassword(DigestUtils.md5DigestAsHex(loginInfo.getPassword().getBytes()));
//        Subject subject = SecurityUtils.getSubject();
//        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(loginInfo.getNumber(), loginInfo.getPassword());
//        try {
//            subject.login(usernamePasswordToken);
//        } catch (UnknownAccountException e) {
//            Map<String, String> map = new HashMap<>();
//            map.put("msg", "账号错误");
//            return ResultVOUtil.error(101, "账号错误");
//        } catch (IncorrectCredentialsException e) {
//            return ResultVOUtil.error(102, "密码错误");
//        }
//        System.out.println("返回来的实体"+subject.getPrincipal());
        Teacher teacher = teacherService.selectByAccountAndPassword(loginInfo);
        if (teacher!=null){
            request.getSession().setAttribute("username", teacher.getName());
            //更新token
            String token = UUID.randomUUID().toString().replace("-", "");
            teacherService.updateToken(teacher.getId(),token);
            teacher.setToken(token);
            return ResultVOUtil.success(teacher);
        }
        return ResultVOUtil.error(101,"账号或密码错误");
    }

    @ApiOperation("获取教师列表")
    @GetMapping("/list")
    public ResultVO getTeacherList(@RequestParam(value ="page",defaultValue = "1") Integer page,
                                   @RequestParam(value ="limit",defaultValue = "10") Integer limit,
                                   @RequestParam(value ="name",defaultValue = "")String name,
                                   @RequestParam(value ="number",defaultValue = "")String number,
                                   @RequestParam(value ="status",defaultValue = "1")Integer status) {
        PageRequest request = PageRequest.of(page-1, limit);
        Page<VSchoolTeacher> teacherPage;
        if (name.isEmpty() && number.isEmpty())
        {
            teacherPage = vSchoolTeacherRepository.findVSchoolTeachersByStatusEquals(status,request);
        }else if (!name.isEmpty() && number.isEmpty())
        {
            teacherPage = vSchoolTeacherRepository.findVSchoolTeachersByNameContainsAndStatusEquals(name,status,request);
        }
        else if (!number.isEmpty() && name.isEmpty()){
            teacherPage = vSchoolTeacherRepository.findVSchoolTeachersByNumberEqualsAndStatusEquals(number,status,request);
        }else{
            teacherPage = vSchoolTeacherRepository.findVSchoolTeachersByNameContainsAndNumberEqualsAndStatusEquals(name,number,status,request);
        }
        return ResultVOUtil.success(teacherPage);
    }

    @ApiOperation("添加教师")
    @PostMapping("/add")
    public ResultVO addTeacher(Teacher teacher) {
        teacher.setEmail("");
        teacher.setToken("111");
        teacher.setStatus(1);
        String s = teacher.getPassword();
        teacher.setPassword(DigestUtils.md5DigestAsHex(s.getBytes()));
        teacher.setCreatedBy(1);
        teacher.setCreatedOn(new Date());
        return  ResultVOUtil.success(teacherRepository.saveAndFlush(teacher));
    }

    @ApiOperation("编辑教师")
    @PutMapping("/edit")
    public ResultVO editTeacher(Teacher teacher) {
        teacher.setModifiedBy(1);
        teacher.setModifiedOn(new Date());
        return ResultVOUtil.success(teacherService.updateByPrimaryKeySelective(teacher));
    }

    @ApiOperation("删除教师")
    @DeleteMapping("/remove")
    public ResultVO removeTeacher(Integer id) {
        return ResultVOUtil.success(teacherService.deleteByPrimaryKey(id));
    }

    @ApiOperation("禁用教师")
    @GetMapping("/disable")
    public ResultVO disableTeacher(Integer id) {
        Teacher teacher = teacherRepository.getOne(id);
        teacher.setStatus(2);
        return ResultVOUtil.success(teacherService.updateByPrimaryKeySelective(teacher));
    }

    @ApiOperation("重置教师密码")
    @PutMapping("/resetPassWord")
    public ResultVO resetPassWord(Integer id){
        Teacher teacher = teacherRepository.getOne(id);
        String s = "123456";
        teacher.setModifiedOn(new Date());
        teacher.setPassword(DigestUtils.md5DigestAsHex(s.getBytes()));
        return ResultVOUtil.success(teacherService.updateByPrimaryKeySelective(teacher));
    }

    @RequestMapping("/selectByAccountAndPassword")
    public ResultVO selectByAccountAndPassword(LoginInfoDTO loginInfo){
        loginInfo.setPassword(DigestUtils.md5DigestAsHex(loginInfo.getPassword().getBytes()));
        return ResultVOUtil.success(teacherService.selectByAccountAndPassword(loginInfo));
    }
}
