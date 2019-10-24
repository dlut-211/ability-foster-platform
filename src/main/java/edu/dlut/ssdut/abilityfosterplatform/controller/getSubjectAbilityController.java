package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.mapper.AbilityMapper;
import edu.dlut.ssdut.abilityfosterplatform.model.Ability;
import edu.dlut.ssdut.abilityfosterplatform.service.AbilityService;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: lhd
 * @Date 2019/10/23 19:13
 * @Description:
 **/
@Api(tags = "getSubjectAbilityController")
@RestController
@RequestMapping("api/StudentAbility")
public class getSubjectAbilityController {

    @Autowired
    private AbilityService abilityService;

    /// 通过学科id和学生学号获取一个学生一门学科的所有能力点分数（能力点分数为作业和试卷的综合）
    @ApiOperation("按能力点id查询能力点")
    @GetMapping("/StudentAbilityScoreEcharts")
    public ResultVO selectById(@RequestParam(value= "subjectId") Integer subjectId, @RequestParam(value ="studentId") Integer studentId, @RequestParam(value ="page",defaultValue = "1")Integer page, @RequestParam(value ="limit",defaultValue = "10")String limit) {
        abilityService.ProcedureGetSubjectAbilityScore(subjectId,studentId);



        return ResultVOUtil.success();
    }
}
