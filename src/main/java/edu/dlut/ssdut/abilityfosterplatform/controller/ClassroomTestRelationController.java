package edu.dlut.ssdut.abilityfosterplatform.controller;

import edu.dlut.ssdut.abilityfosterplatform.model.KnowledgeTest;
import edu.dlut.ssdut.abilityfosterplatform.service.ClassroomTestRelationService;
import edu.dlut.ssdut.abilityfosterplatform.utils.ResultVOUtil;
import edu.dlut.ssdut.abilityfosterplatform.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/classroomTestRelation")
public class ClassroomTestRelationController {
    @Autowired
    ClassroomTestRelationService classroomTestRelationService;

    /**
     * 根据章节 Id 和课堂 Id 来查找布置的试题
     * @param chapterId
     * @param classroomId
     * @return
     */
    @GetMapping("/getAllTest")
    public ResultVO getAllTestById(int chapterId, int classroomId) {
        List<KnowledgeTest> testList = classroomTestRelationService.getALlTestById(chapterId, classroomId);
        return ResultVOUtil.success(testList);
    }

}
