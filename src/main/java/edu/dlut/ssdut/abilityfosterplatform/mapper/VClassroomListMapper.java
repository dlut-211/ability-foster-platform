package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.VClassroomList;

import java.util.List;

public interface VClassroomListMapper {
    int insert(VClassroomList record);

    int insertSelective(VClassroomList record);

    List<VClassroomList> getClassRoomList(String beginDateStart, String beginDateEnd, String endDateStart, String endDateEnd, Integer termType, Integer status, String name, Integer tmp, Integer limit);

    Integer getClassRoomListCount(String beginDateStart, String beginDateEnd, String endDateStart, String endDateEnd, Integer termType, Integer status, String name, Integer tmp, Integer limit);
}