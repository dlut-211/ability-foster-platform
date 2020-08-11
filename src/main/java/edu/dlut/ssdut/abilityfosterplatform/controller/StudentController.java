package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.dto.LoginInfoDTO;
import edu.dlut.ssdut.abilityfosterplatform.model.Student;
import edu.dlut.ssdut.abilityfosterplatform.service.StudentService;
import edu.dlut.ssdut.abilityfosterplatform.service.StudentSubjectService;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "StudentController")
@RestController
@RequestMapping("/api/studentcontroller")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private StudentSubjectService studentSubjectService;
    @RequestMapping("selectByAccountAndPassword")
    public ResultVO selectByAccountAndPassword(LoginInfoDTO loginInfoDTO){
        loginInfoDTO.setPassword(DigestUtils.md5DigestAsHex(loginInfoDTO.getPassword().getBytes()));
        Student student = studentService.selectByAccountAndPassword(loginInfoDTO);
        if (student != null) {
            return ResultVOUtil.success(student);
        }
        return ResultVOUtil.error(101, "账号或密码错误");
    }
    @GetMapping("/selectByStudentId")
    public ResultVO selectByStudentId(Integer studentId){
        List<Integer> list = studentSubjectService.selectByStudentId(studentId);
        if (list.size()!=0)
            return ResultVOUtil.success(list.get(0));
        else
            return ResultVOUtil.error(400, "错误");
    }
}
