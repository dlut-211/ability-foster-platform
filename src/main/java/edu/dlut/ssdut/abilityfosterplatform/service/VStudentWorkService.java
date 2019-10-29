package edu.dlut.ssdut.abilityfosterplatform.service;


import edu.dlut.ssdut.abilityfosterplatform.dto.StudentWorkDTO;

/**
 * @AUTHOR: raymond
 * @DATE: 2019/10/27
 * DESCRIPTION:
 **/
public interface VStudentWorkService {
    StudentWorkDTO findStudentWork(Integer classroomWorkId);
}
