package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.model.StudentWork;

import java.util.Date;

public interface StudentWorkService {
    int layoutWork(Integer userId, Integer classRoomWorkId, Date endTime);

    int revokeLayoutWork(Integer classroomWorkId, Integer userId);

    int updateByPrimaryKey(StudentWork record);
}
