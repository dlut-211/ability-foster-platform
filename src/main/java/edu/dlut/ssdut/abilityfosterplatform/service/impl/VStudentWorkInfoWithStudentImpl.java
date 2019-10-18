package edu.dlut.ssdut.abilityfosterplatform.service.impl;


import edu.dlut.ssdut.abilityfosterplatform.mapper.VStudentworkinfowithstudentMapper;
import edu.dlut.ssdut.abilityfosterplatform.model.StudentWorkInfoWithStudentDto;
import edu.dlut.ssdut.abilityfosterplatform.model.VStudentworkinfowithstudent;
import edu.dlut.ssdut.abilityfosterplatform.service.VStudentWorkInfoWithStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VStudentWorkInfoWithStudentImpl implements VStudentWorkInfoWithStudentService {
    @Autowired
    private VStudentworkinfowithstudentMapper vStudentworkinfowithstudentMapper;

    @Override
    public Integer getAllWorkInfoData(Integer studentId) {
        return vStudentworkinfowithstudentMapper.getAllWorkInfoData(studentId);
    }

    @Override
    public List<VStudentworkinfowithstudent> getStudentWorkInfoWithStudent(StudentWorkInfoWithStudentDto swiwDto) {
        return vStudentworkinfowithstudentMapper.getStudentWorkInfoWithStudent(swiwDto);
    }
}
