package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.model.Classroom;
import edu.dlut.ssdut.abilityfosterplatform.model.VClassroomList;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

/**
 * @Author YuJunMing
 * @Date 2019/10/25 11:50
 * DESCRIPTION:
 */
public interface ClassRoomService {

    List<VClassroomList> getClassRoomList(String beginDateStart, String beginDateEnd, String endDateStart, String endDateEnd, Integer termType, Integer status, String name, Integer page, Integer limit);

    Integer getClassRoomListCount(String beginDateStart, String beginDateEnd, String endDateStart, String endDateEnd, Integer termType, Integer status, String name, Integer page, Integer limit);

    Integer editStatus(String Id,String Status);

    int deleteByPrimaryKey(Integer id);

    int insert(Classroom record);

    int insertSelective(Classroom record);

    Classroom selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Classroom record);

    int updateByPrimaryKey(Classroom record);

    Classroom selectClassroomByCid(Integer id);

    List<Classroom> getClassroomList();

    int addClassRoom(Map<String, String> params, Integer teacherId) throws ParseException;

}
