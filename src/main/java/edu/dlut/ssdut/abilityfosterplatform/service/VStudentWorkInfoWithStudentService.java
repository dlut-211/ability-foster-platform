package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.model.StudentWorkInfoWithStudentDto;
import edu.dlut.ssdut.abilityfosterplatform.model.VStudentworkinfowithstudent;

import java.util.List;

public interface VStudentWorkInfoWithStudentService {
    List<VStudentworkinfowithstudent>getStudentWorkInfoWithStudent(StudentWorkInfoWithStudentDto swiwDto);
    Integer getAllWorkInfoData(Integer studentId);
}
