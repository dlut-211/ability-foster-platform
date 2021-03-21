package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.dto.StudentTestResultDto;
import edu.dlut.ssdut.abilityfosterplatform.dto.TestDetailDTO;
import edu.dlut.ssdut.abilityfosterplatform.model.StudentKnowledgeTestRelation;
import edu.dlut.ssdut.abilityfosterplatform.service.StudentTestRelationService;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.web.servlet.ShiroHttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api/studentTestRelation")
public class StudentTestRelationController {
    @Resource
    StudentTestRelationService studentTestRelationService;

    @PostMapping("/saveAnswer")
    public ResultVO saveAnswer(@RequestBody StudentKnowledgeTestRelation studentKnowledgeTestRelation) {
        studentTestRelationService.insert(studentKnowledgeTestRelation);
        return ResultVOUtil.success();
    }

    /**
     * 根据classroomId 和 testId 来获取 test 的正确率，返回的是整数
     * @param classroomId
     * @param testId
     * @return
     */
    @GetMapping("/getCorrectRateByClassroomAndTest")
    public ResultVO getCorrectRateByClassroom(int classroomId, int testId) {
        int rate = studentTestRelationService.getCorrectRateByClassroom(classroomId, testId);
        return ResultVOUtil.success(rate);
    }

    /**
     * 根据课堂 id 和学生 id 获取学生此门课程下的测试
     * @param classroomId
     * @param studentId
     * @return
     */
    @GetMapping("/getTestByClassroomAndStudent")
    public ResultVO getTestByClassroomAndStudent(int classroomId, int studentId) {
        List<StudentTestResultDto> resultDtos = studentTestRelationService.getTestByClassroomAndStudent(classroomId, studentId);
        return ResultVOUtil.success(resultDtos);
    }

    /**
     * 根据测试 id 和 学生 id 来获取学生这道测试的详细信息
     * @param knowledgeTestId
     * @param studentId
     * @return
     */
    @GetMapping("/getTestDetail")
    public ResultVO getTestDetail(int knowledgeTestId, int studentId) {
        TestDetailDTO testDetailDTO = studentTestRelationService.getTestDetail(knowledgeTestId, studentId);
        return ResultVOUtil.success(testDetailDTO);
    }

    @ApiOperation("教师撤销随堂测试")
    @DeleteMapping("/revokeClassTest")
    public ResultVO delectStudentTests(int knowledgeTestId, int classroomId) {
        return ResultVOUtil.success(studentTestRelationService.delectStudentTests(knowledgeTestId, classroomId));
    }

    @ApiOperation("随堂作业通过情况饼图展示")
    @GetMapping("/getPieNums")
    public ResultVO getPieNums(int knowledgeTestId, int classroomId) {
        return ResultVOUtil.success(studentTestRelationService.getPieNums(knowledgeTestId, classroomId));
    }

}
