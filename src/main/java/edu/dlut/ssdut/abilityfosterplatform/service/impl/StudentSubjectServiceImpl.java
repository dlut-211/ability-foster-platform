package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.mapper.VAllSubjectStudentTestPaperKnowledgeMapper;
import edu.dlut.ssdut.abilityfosterplatform.service.StudentSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author :zjk
 * @Date :Create in 20:58 2019-11-06
 * @Description 学生学科实现类
 **/
@Service
public class StudentSubjectServiceImpl implements StudentSubjectService {
    @Autowired
    private VAllSubjectStudentTestPaperKnowledgeMapper assmapper;
    @Override
    public List<Integer> selectByStudentId(Integer studentId) {
        return assmapper.selectByStudentId(studentId);
    }
}
