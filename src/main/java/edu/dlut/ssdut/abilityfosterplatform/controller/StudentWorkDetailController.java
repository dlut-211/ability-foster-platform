package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.mapper.StudentWorkDetailMapper;
import edu.dlut.ssdut.abilityfosterplatform.mapper.StudentWorkMapper;
import edu.dlut.ssdut.abilityfosterplatform.model.StudentWorkDetail;
import edu.dlut.ssdut.abilityfosterplatform.service.VStudentWorkDetailService;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;


import java.util.List;


/**
 * @AUTHOR: raymond
 * @DATE: 2019/10/27
 * DESCRIPTION:
 **/
@Api(tags = "StudentWorkDetailController")
@RestController
@RequestMapping("/api/studentworkdetail")
public class StudentWorkDetailController {

    @Autowired
    private VStudentWorkDetailService vStudentWorkDetailService;
    @Autowired
    private StudentWorkDetailMapper studentWorkDetailMapper;

    @ApiOperation("按照学生作业ID获取学生作业列表")
    @GetMapping("/list")
    public ResultVO list(@RequestParam("studentWorkId") Integer studentWorkId,
                         @RequestParam(value = "page", defaultValue = "1") Integer page,
                         @RequestParam(value = "limit", defaultValue = "10") Integer limit
                         ) {
        PageRequest request = PageRequest.of(page - 1, limit);
        return ResultVOUtil.success(vStudentWorkDetailService.findAllByStudentWorkId(studentWorkId, request));
    }

    @ApiOperation("增加学生作业细节")
    @PostMapping("/add")
    public ResultVO add(StudentWorkDetail studentWorkDetail){
        List<StudentWorkDetail> swd = vStudentWorkDetailService.selectByStudentWorkId(studentWorkDetail.getStudentWorkId());
        if (swd==null){
            int i=vStudentWorkDetailService.insert(studentWorkDetail);
            System.out.println(studentWorkDetail);
            if (i==1)
                return ResultVOUtil.success();
            else
                return ResultVOUtil.error(400, "上传作业错误");
        }
        else{
            studentWorkDetail.setId(swd.get(0).getId());
            int i = studentWorkDetailMapper.updateByPrimaryKey(studentWorkDetail);
            if (i==1)
                return ResultVOUtil.success();
            else
                return ResultVOUtil.error(400, "上传作业错误");
        }

    }
}
