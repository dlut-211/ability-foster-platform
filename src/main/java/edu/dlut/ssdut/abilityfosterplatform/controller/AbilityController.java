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
        ability.setCreatedOn(new Date());
        ability.setCreatedBy(1);
        return  ResultVOUtil.success(abilityRepository.saveAndFlush(ability));
    }

    @ApiOperation("删除条目")
    @DeleteMapping("/remove")
    public ResultVO removeAbility(@RequestParam(value ="id") Integer id) {
        abilityRepository.deleteById(id);
        return ResultVOUtil.success();
    }
    @ApiOperation("能力点图")
    @RequestMapping("/gettestabilitydata")
    public ResultVO getAbilityData(Integer subjectId,Integer studentId){
        List<SubjectTestAbilityScoreDTO> testAbilityList = abilityService.ProceduregetSubjectTestAbilityScore(subjectId, studentId);
        List<SubjectWorkAbilityScoreDTO> workAbilityList = abilityService.ProceduregetSubjectWorkAbilityScore(subjectId, studentId);
        List<StudentAbilityNameAndMaxDTO> studentAbilityNameAndMaxDTOS = new ArrayList<StudentAbilityNameAndMaxDTO>();
        List<StudentAbilityNameAndMaxDTO> realStudentAbilityNameAndMaxDTOS= new ArrayList<StudentAbilityNameAndMaxDTO>();
        if(testAbilityList!=null&& workAbilityList!=null){
            for (int i = 0; i < testAbilityList.size(); i++)
            {
                if (testAbilityList.get(i).getAbilityname()!=null) {
                    StudentAbilityNameAndMaxDTO mode = new StudentAbilityNameAndMaxDTO();
                    StudentAbilityNameAndMaxDTO realMode = new StudentAbilityNameAndMaxDTO();
                    mode.setName(testAbilityList.get(i).getAbilityname());
                    realMode.setName(testAbilityList.get(i).getAbilityname());
                    if (String.valueOf(testAbilityList.get(i).getAbilityscoresum())==null){
                        mode.setMax(0);
                    }
                    else{
                        mode.setMax(testAbilityList.get(i).getAbilityscoresum());
                    }
                    if (String.valueOf(testAbilityList.get(i).getAbilityscore())==null){
                        realMode.setMax(0);
                    }
                    else
                        realMode.setMax(testAbilityList.get(i).getAbilityscore());
                    studentAbilityNameAndMaxDTOS.add(mode);
                    realStudentAbilityNameAndMaxDTOS.add(realMode);
                }
            }
            for (SubjectWorkAbilityScoreDTO subjectWorkAbilityScoreDTO : workAbilityList) {
                int flag=0;
                int realFlag=0;
                for (StudentAbilityNameAndMaxDTO item : studentAbilityNameAndMaxDTOS) {
                    if (item.getName().equals(subjectWorkAbilityScoreDTO.getAbilityname())) {
                        flag=1;
                        item.setMax(item.getMax()+subjectWorkAbilityScoreDTO.getAbilityscoresum());
                        break;
                    }
                }
                for (StudentAbilityNameAndMaxDTO item : realStudentAbilityNameAndMaxDTOS) {
                    if (item.getName().equals(subjectWorkAbilityScoreDTO.getAbilityname())) {
                        realFlag=1;
                        item.setMax(item.getMax()+subjectWorkAbilityScoreDTO.getAbilityscore());
                    }
                }
                if (flag==0){
                    StudentAbilityNameAndMaxDTO mode = new StudentAbilityNameAndMaxDTO();
                    mode.setName(subjectWorkAbilityScoreDTO.getAbilityname());
                    mode.setMax(subjectWorkAbilityScoreDTO.getAbilityscoresum());
                    studentAbilityNameAndMaxDTOS.add(mode);
                }
                if (realFlag==0){
                    StudentAbilityNameAndMaxDTO realMode = new StudentAbilityNameAndMaxDTO();
                    realMode.setName(subjectWorkAbilityScoreDTO.getAbilityname());
                    realMode.setMax(subjectWorkAbilityScoreDTO.getAbilityscore());
                    realStudentAbilityNameAndMaxDTOS.add(realMode);
                }
            }
        }
        Map<String, Object> map = new HashMap<String,Object>();
        map.put("studentAbilityNameAndMaxDTOS", studentAbilityNameAndMaxDTOS);
        map.put("realStudentAbilityNameAndMaxDTOS", realStudentAbilityNameAndMaxDTOS);
        return ResultVOUtil.success(map);
    }

//    @RequestMapping("/getworkabilitydata")
//    public ResultVO getWorkAbilityData(Integer subjectId,Integer studentId){
//        List<SubjectWorkAbilityScoreDTO> workAbilityList = abilityService.ProceduregetSubjectWorkAbilityScore(subjectId, studentId);
//        return ResultVOUtil.success(workAbilityList);
//    }
}
