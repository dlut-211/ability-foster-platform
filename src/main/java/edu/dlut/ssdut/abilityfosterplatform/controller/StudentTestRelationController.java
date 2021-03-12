package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.model.StudentKnowledgeTestRelation;
import edu.dlut.ssdut.abilityfosterplatform.service.StudentTestRelationService;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import org.apache.shiro.web.servlet.ShiroHttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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
}
