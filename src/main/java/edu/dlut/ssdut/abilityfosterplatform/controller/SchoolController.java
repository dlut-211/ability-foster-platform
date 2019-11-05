package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.model.School;
import edu.dlut.ssdut.abilityfosterplatform.repository.SchoolRepository;
import edu.dlut.ssdut.abilityfosterplatform.service.SchoolService;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: wdz
 * @Date: 2019/11/3 19:07
 * @Description:
 **/
@Api(tags = "SchoolController")
@RestController
@RequestMapping("/api/school")
public class SchoolController {
    @Autowired
    private SchoolService schoolService;
    @Autowired
    private SchoolRepository schoolRepository;

    @ApiOperation("添加学校")
    @PostMapping("/add")
    public ResultVO addSchool(String name){
        School school = new School();
        school.setName(name);
        return ResultVOUtil.success(schoolRepository.saveAndFlush(school));
    }

    @ApiOperation("删除学校")
    @DeleteMapping("/remove")
    public ResultVO removeSchool(Integer id){
        schoolRepository.deleteById(id);
        return ResultVOUtil.success();
    }

    @ApiOperation("修改学校")
    @PutMapping("/edit")
    public ResultVO editSchool(School school){
        return ResultVOUtil.success(schoolService.updateByPrimaryKeySelective(school));
    }
    @ApiOperation("学校列表")
    @GetMapping("/list")
    public ResultVO getSchoolList(@RequestParam(value = "page",defaultValue = "1")Integer page,
                                  @RequestParam(value = "limit",defaultValue = "10")Integer limit,
                                  @RequestParam(value = "name",defaultValue = "")String name){
        PageRequest request = PageRequest.of(page-1,limit);
        Page<School> schoolPage;
        if(!name.isEmpty()){
            schoolPage = schoolRepository.findSchoolsByNameContains(name,request);
        }
        else {
            schoolPage = schoolRepository.findAll(request);
        }
        return ResultVOUtil.success(schoolPage);
    }
    @ApiOperation("所有学校信息")
    @GetMapping("/getAllSchoolList")
    public ResultVO getAllSchoolList(){
        List<School> schoolList = schoolRepository.findAll();
        return ResultVOUtil.success(schoolList);
    }

}
