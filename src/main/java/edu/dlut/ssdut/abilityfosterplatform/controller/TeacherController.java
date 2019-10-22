package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.model.SystemOption;
import edu.dlut.ssdut.abilityfosterplatform.model.Teacher;
import edu.dlut.ssdut.abilityfosterplatform.repository.SystemOptionRepository;
import edu.dlut.ssdut.abilityfosterplatform.repository.TeacherRepository;
import edu.dlut.ssdut.abilityfosterplatform.service.SystemOptionService;
import edu.dlut.ssdut.abilityfosterplatform.service.TeacherService;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Api(tags = "TeacherController")
@RestController
@RequestMapping("/api/teachercontroller")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @Autowired
    private TeacherRepository teacherRepository;

    @ApiOperation("获取教师列表")
    @GetMapping("/getTeacherList")
    public ResultVO getTeacherList(@RequestParam(value ="page",defaultValue = "1") Integer page, @RequestParam(value ="limit",defaultValue = "10") Integer limit, @RequestParam(value ="name",defaultValue = "")String name, @RequestParam(value ="number",defaultValue = "")String number) {
        PageRequest request = PageRequest.of(page-1, limit);
        Page<Teacher> teacherPage;
        if (name.isEmpty() && number.isEmpty())
        {
            teacherPage =  teacherRepository.findAll(request);
        }else if (!name.isEmpty() && number.isEmpty())
        {
            teacherPage =  teacherRepository.findTeachersByNameContains(name,request);
        }
        else if (!number.isEmpty() && name.isEmpty()){
            teacherPage =  teacherRepository.findTeachersByNumberEquals(number,request);
        }else{
            teacherPage =  teacherRepository.findTeachersByNameContainsAndNumberEquals(name,number,request);
        }
        return ResultVOUtil.success( teacherPage);
    }

    @ApiOperation("添加教师")
    @PostMapping("/addTeacher")
    public ResultVO addTeacher(Teacher teacher) {
        teacher.setEmail("123456@qq.com");
        teacher.setToken("111");
        teacher.setStatus(1);
        teacher.setPassword("123ZYC");
        teacher.setCreatedBy(1);
        teacher.setCreatedOn(new Date());
//        return ResultVOUtil.success(systemOptionService.insertSelective(systemOption));
        return  ResultVOUtil.success(teacherRepository.saveAndFlush(teacher));
    }

    @ApiOperation("编辑教师")
    @PutMapping("/editTeacher")
    public ResultVO editTeacher(Teacher teacher) {
        teacher.setModifiedBy(1);
        teacher.setModifiedOn(new Date());
        return ResultVOUtil.success(teacherService.updateByPrimaryKeySelective(teacher));
    }

    @ApiOperation("删除教师")
    @DeleteMapping("/removeTeacher")
    public ResultVO removeTeacher(Integer id) {
        return ResultVOUtil.success(teacherService.deleteByPrimaryKey(id));
    }
}
