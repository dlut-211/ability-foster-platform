package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.model.Classroom;
import edu.dlut.ssdut.abilityfosterplatform.model.VClassroomList;

import java.util.List;
/**
 * @Author YuJunMing
 * @Date 2019/10/25 11:50
 * DESCRIPTION:
 */
public interface ClassRoomService {

    List<VClassroomList> getClassRoomList(String beginDateStart, String beginDateEnd, String endDateStart, String endDateEnd, Integer termType, Integer status, String name, Integer page, Integer limit);

    Integer getClassRoomListCount(String beginDateStart, String beginDateEnd, String endDateStart, String endDateEnd, Integer termType, Integer status, String name, Integer page, Integer limit);

}
