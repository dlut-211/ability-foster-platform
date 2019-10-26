package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Classroom;

import java.util.List;

public interface ClassroomMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Classroom record);

    int insertSelective(Classroom record);

    Classroom selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Classroom record);

    int updateByPrimaryKey(Classroom record);

    Classroom selectClassroomByCid(Integer id);

    List<Classroom> getClassroomList();


    Integer editStatus(String Id,String Status);

}