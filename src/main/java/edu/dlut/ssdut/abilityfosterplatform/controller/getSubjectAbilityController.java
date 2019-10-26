package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.dto.StudentAbilityNameAndMaxDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.SubjectTestAbilityScoreDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.SubjectTotalScoreDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.SubjectWorkAbilityScoreDTO;
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @ApiOperation("通过学科id和学生学号获取一个学生一门学科的所有能力点分数（能力点分数为作业和试卷的综合）")
    @GetMapping("/StudentAbilityScoreEcharts")
    public ResultVO getStudentAbilityScoreEcharts(@RequestParam(value= "subjectId") Integer subjectId,
                                                  @RequestParam(value ="studentId") Integer studentId,
                                                  @RequestParam(value ="page",defaultValue = "1")Integer page,
                                                  @RequestParam(value ="limit",defaultValue = "10")String limit){
        List<SubjectTestAbilityScoreDTO> testAbilityList = abilityService.ProcedureGetSubjectTestAbilityScore(subjectId, studentId);
        List<SubjectWorkAbilityScoreDTO> workAbilityList = abilityService.ProcedureGetSubjectWorkAbilityScore(subjectId, studentId);
        List<StudentAbilityNameAndMaxDTO> studentAbilityNameAndMaxDTOS = new ArrayList<StudentAbilityNameAndMaxDTO>();
        List<StudentAbilityNameAndMaxDTO> realStudentAbilityNameAndMaxDTOS= new ArrayList<StudentAbilityNameAndMaxDTO>();
        if(testAbilityList!=null&& workAbilityList!=null){
            for (int i = 0; i < testAbilityList.size(); i++)
            {
                if (testAbilityList.get(i).getAbilityName()!=null) {
                    StudentAbilityNameAndMaxDTO mode = new StudentAbilityNameAndMaxDTO();
                    StudentAbilityNameAndMaxDTO realMode = new StudentAbilityNameAndMaxDTO();
                    mode.setName(testAbilityList.get(i).getAbilityName());
                    realMode.setName(testAbilityList.get(i).getAbilityName());
                    if (String.valueOf(testAbilityList.get(i).getAbilityScoreSum())==null){
                        mode.setMax(0);
                    }
                    else{
                        mode.setMax(testAbilityList.get(i).getAbilityScoreSum());
                    }
                    if (String.valueOf(testAbilityList.get(i).getAbilityScore())==null){
                        realMode.setMax(0);
                    }
                    else
                        realMode.setMax(testAbilityList.get(i).getAbilityScore());
                    studentAbilityNameAndMaxDTOS.add(mode);
                    realStudentAbilityNameAndMaxDTOS.add(realMode);
                }
            }
            for (SubjectWorkAbilityScoreDTO subjectWorkAbilityScoreDTO : workAbilityList) {
                int flag=0;
                int realFlag=0;
                for (StudentAbilityNameAndMaxDTO item : studentAbilityNameAndMaxDTOS) {
                    if (item.getName().equals(subjectWorkAbilityScoreDTO.getAbilityName())) {
                        flag=1;
                        item.setMax(item.getMax()+subjectWorkAbilityScoreDTO.getAbilityScoreSum());
                        break;
                    }
                }
                for (StudentAbilityNameAndMaxDTO item : realStudentAbilityNameAndMaxDTOS) {
                    if (item.getName().equals(subjectWorkAbilityScoreDTO.getAbilityName())) {
                        realFlag=1;
                        item.setMax(item.getMax()+subjectWorkAbilityScoreDTO.getAbilityScore());
                    }
                }
                if (flag==0){
                    StudentAbilityNameAndMaxDTO mode = new StudentAbilityNameAndMaxDTO();
                    mode.setName(subjectWorkAbilityScoreDTO.getAbilityName());
                    mode.setMax(subjectWorkAbilityScoreDTO.getAbilityScoreSum());
                    studentAbilityNameAndMaxDTOS.add(mode);
                }
                if (realFlag==0){
                    StudentAbilityNameAndMaxDTO realMode = new StudentAbilityNameAndMaxDTO();
                    realMode.setName(subjectWorkAbilityScoreDTO.getAbilityName());
                    realMode.setMax(subjectWorkAbilityScoreDTO.getAbilityScore());
                    realStudentAbilityNameAndMaxDTOS.add(realMode);
                }
            }
        }
        Map<String, Object> map = new HashMap<String,Object>();
        map.put("studentAbilityNameAndMaxDTOS", studentAbilityNameAndMaxDTOS);
        map.put("realStudentAbilityNameAndMaxDTOS", realStudentAbilityNameAndMaxDTOS);
        return ResultVOUtil.success(map);
    }

    /// 通过学科id和学生学号获取一个学生一门学科的所有能力点分数（能力点分数为作业和试卷的综合）
    @ApiOperation("通过课堂id获得这门课的，试卷学生答题情况分布图，作业答题情况分布图")
    @GetMapping("/StudentSubjectScoreEcharts")
    public ResultVO getStudentSubjectScoreEcharts(@RequestParam(value= "subjectId") Integer subjectId,
                                                  @RequestParam(value ="studentId") Integer studentId,
                                                  @RequestParam(value ="page",defaultValue = "1")Integer page,
                                                  @RequestParam(value ="limit",defaultValue = "1")Integer limit) {
        Integer startNode=(page-1)*limit;
        Integer limitSize=limit;
        List<SubjectTotalScoreDTO> subjectTotalList = abilityService.ProcedureGetSubjectTotalScore(subjectId,studentId,startNode,limitSize);
        List<SubjectTotalScoreDTO> subjectTotalListCount = abilityService.ProcedureGetSubjectTotalScore(subjectId,studentId,0,99999);
        Map<String, Object> map = new HashMap<String,Object>();
        map.put("content", subjectTotalList);
        map.put("total", subjectTotalListCount.size());
        return ResultVOUtil.success(map);
    }
}
