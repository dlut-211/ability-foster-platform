package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.StudentWorkInfoWithStudentDto;
import edu.dlut.ssdut.abilityfosterplatform.model.VStudentworkinfowithstudent;

import java.util.List;

public interface VStudentworkinfowithstudentMapper {
    int insert(VStudentworkinfowithstudent record);

    int insertSelective(VStudentworkinfowithstudent record);

    List<VStudentworkinfowithstudent>getStudentWorkInfoWithStudent(StudentWorkInfoWithStudentDto swiwDto);

    int getAllWorkInfoData(Integer studentId);
}
