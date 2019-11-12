package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.dto.StudentAbilityNameAndMaxDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.SubjectTestAbilityScoreDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.SubjectWorkAbilityScoreDTO;
import edu.dlut.ssdut.abilityfosterplatform.enums.ResultEnum;
import edu.dlut.ssdut.abilityfosterplatform.model.Ability;
import edu.dlut.ssdut.abilityfosterplatform.model.SystemOption;
import edu.dlut.ssdut.abilityfosterplatform.repository.AbilityRepository;
import edu.dlut.ssdut.abilityfosterplatform.service.AbilityService;
import edu.dlut.ssdut.abilityfosterplatform.utils.EnumUtil;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @Author: lhd
 * @Date 2019/10/22 10:24
 * @Description: 能力点 控制层
 **/
@Api(tags = "AbilityController")
@RestController
@RequestMapping("/api/ability")
public class AbilityController {

    @Autowired
    private AbilityService abilityService;
    @Autowired
    private AbilityRepository abilityRepository;

    @ApiOperation("按能力点id查询能力点")
    @GetMapping("/selectById")
    public ResultVO selectById(@RequestParam("id") Integer id) {
        return ResultVOUtil.success(abilityService.selectByPrimaryKey(id));
    }

    @ApiOperation("按学科id查询能力点")
    @GetMapping("/SubjectAbility")
    public ResultVO selectBySubjectId(@RequestParam(value= "subjectId") Integer subjectId, @RequestParam(value ="page",defaultValue = "1") Integer page, @RequestParam(value ="limit",defaultValue = "10")Integer limit, @RequestParam(value ="name",defaultValue = "")String name) {
        PageRequest request = PageRequest.of(page-1, limit);
        return ResultVOUtil.success(abilityRepository.findAbilitiesBySubjectIdEqualsAndNameContains(subjectId,name,request));
    }

    @ApiOperation("按学科id查询能力点2")
    @GetMapping("/SubjectAbility1")
    public ResultVO selectBySubjectId1(@RequestParam(value= "subjectId") Integer subjectId, @RequestParam(value ="page",defaultValue = "1") Integer page, @RequestParam(value ="limit",defaultValue = "10")Integer limit, @RequestParam(value ="name",defaultValue = "")String name) {
        PageRequest request = PageRequest.of(page-1, limit);
        return ResultVOUtil.success(abilityRepository.findAbilitiesBySubjectIdEqualsAndNameEquals(subjectId,name,request));
    }

    @ApiOperation("编辑条目")
    @PutMapping("/edit")
    public ResultVO editAbility(Ability ability) {
        ability.setModifiedBy(1);
        ability.setModifiedOn(new Date());
        return ResultVOUtil.success(abilityService.updateByPrimaryKeySelective(ability));
    }

    @ApiOperation("添加条目")
    @PostMapping("/add")
    public ResultVO addAbility(Ability ability) {
        System.out.println(ability);
        ability.setCreatedOn(new Date());
        ability.setCreatedBy(1);
        List<Ability> abilityList = abilityRepository.findAbilitiesByNameEquals(ability.getName());
        if (abilityList.isEmpty()){
        return  ResultVOUtil.success(abilityRepository.saveAndFlush(ability));
        }else{
            return ResultVOUtil.error(800,"该能力点已存在");
        }
    }

    @ApiOperation("删除条目")
    @DeleteMapping("/remove")
    public ResultVO removeAbility(@RequestParam(value ="id") Integer id) {
        abilityRepository.deleteById(id);
        return ResultVOUtil.success();
    }


//    @RequestMapping("/getworkabilitydata")
//    public ResultVO getWorkAbilityData(Integer subjectId,Integer studentId){
//        List<SubjectWorkAbilityScoreDTO> workAbilityList = abilityService.ProceduregetSubjectWorkAbilityScore(subjectId, studentId);
//        return ResultVOUtil.success(workAbilityList);
//    }
}
