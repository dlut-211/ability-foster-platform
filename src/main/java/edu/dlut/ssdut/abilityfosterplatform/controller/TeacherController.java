package edu.dlut.ssdut.abilityfosterplatform.controller;


import edu.dlut.ssdut.abilityfosterplatform.dto.LoginInfoDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.SchoolTeacherDTO;
import edu.dlut.ssdut.abilityfosterplatform.enums.ResultEnum;
import edu.dlut.ssdut.abilityfosterplatform.exception.PlatformException;
import edu.dlut.ssdut.abilityfosterplatform.model.LoginInfo;
import edu.dlut.ssdut.abilityfosterplatform.model.School;
import edu.dlut.ssdut.abilityfosterplatform.model.SystemOption;
import edu.dlut.ssdut.abilityfosterplatform.model.Teacher;
import edu.dlut.ssdut.abilityfosterplatform.repository.SchoolRepository;
import edu.dlut.ssdut.abilityfosterplatform.repository.SystemOptionRepository;
import edu.dlut.ssdut.abilityfosterplatform.repository.TeacherRepository;
import edu.dlut.ssdut.abilityfosterplatform.service.TeacherService;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.util.DigestUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Api(tags = "TeacherController")
@RestController
@RequestMapping("/api/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @Autowired
    private TeacherRepository teacherRepository;
    @Autowired
    private SystemOptionRepository systemOptionRepository;
    @Autowired
    private SchoolRepository schoolRepository;

    @ApiOperation("教师登录")
    @RequestMapping(value = "/selectByAccountAndPassword", method = RequestMethod.GET)
    public ResultVO selectByAccountAndPassword(LoginInfo loginInfo, HttpServletRequest request) {
        loginInfo.setPassword(DigestUtils.md5DigestAsHex(loginInfo.getPassword().getBytes()));
        Teacher teacher = teacherService.selectByAccountAndPassword(loginInfo);
        request.getSession().setAttribute("username", teacher.getName());
        return ResultVOUtil.success(teacher);
    }

    @ApiOperation("获取教师列表")
    @GetMapping("/list")
    public ResultVO getTeacherList(@RequestParam(value ="page",defaultValue = "1") Integer page, @RequestParam(value ="limit",defaultValue = "10") Integer limit, @RequestParam(value ="name",defaultValue = "")String name, @RequestParam(value ="number",defaultValue = "")String number,@RequestParam(value ="status",defaultValue = "1")Integer status) {
        PageRequest request = PageRequest.of(page-1, limit);
        Page<Teacher> teacherPage;
        if (name.isEmpty() && number.isEmpty())
        {
            teacherPage =  teacherRepository.findTeachersByStatusEquals(status,request);
        }else if (!name.isEmpty() && number.isEmpty())
        {
            teacherPage =  teacherRepository.findTeachersByNameContainsAndStatusEquals(name,status,request);
        }
        else if (!number.isEmpty() && name.isEmpty()){
            teacherPage =  teacherRepository.findTeachersByNumberEqualsAndStatusEquals(number,status,request);
        }else{
            teacherPage =  teacherRepository.findTeachersByNameContainsAndNumberEqualsAndStatusEquals(name,number,status,request);
        }
        List<SchoolTeacherDTO> schoolTeacherDTOList = new ArrayList<>();
        for (Teacher teacher:teacherPage){
            SchoolTeacherDTO schoolTeacherDTO = new SchoolTeacherDTO();
//            SystemOption systemOption = systemOptionRepository.findById(teacher.getSubjectId()).orElse(null);
//            if (ObjectUtils.isEmpty(systemOption)){
//                throw new PlatformException(ResultEnum.SYSTEM_OPTION_NOT_FOUND);
//            }
            BeanUtils.copyProperties(teacher,schoolTeacherDTO);
//            schoolTeacherDTO.setSubjectName(systemOption.getOptionValue());
            School school =schoolRepository.findById(teacher.getSchoolId()).orElse(null);
            if (ObjectUtils.isEmpty(school)){
                throw new PlatformException(ResultEnum.ERROR);
            }
            schoolTeacherDTO.setSchoolName(school.getName());
            schoolTeacherDTOList.add(schoolTeacherDTO);
        }
        Page<SchoolTeacherDTO> schoolTeacherDTOPage = new PageImpl<>(schoolTeacherDTOList,request,schoolTeacherDTOList.size());
        return ResultVOUtil.success(schoolTeacherDTOPage);
    }

    @ApiOperation("添加教师")
    @PostMapping("/add")
    public ResultVO addTeacher(Teacher teacher) {
        teacher.setEmail("");
        teacher.setToken("111");
        teacher.setStatus(1);
        teacher.setPassword(teacher.getNumber());
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
        teacher.setPassword("123456");
        teacher.setModifiedOn(new Date());
        return ResultVOUtil.success(teacherService.updateByPrimaryKeySelective(teacher));
    }

    @RequestMapping("/selectByAccountAndPassword")
    public ResultVO selectByAccountAndPassword(LoginInfoDTO loginInfo){
        loginInfo.setPassword(DigestUtils.md5DigestAsHex(loginInfo.getPassword().getBytes()));
        return ResultVOUtil.success(teacherService.selectByAccountAndPassword(loginInfo));
    }
}
