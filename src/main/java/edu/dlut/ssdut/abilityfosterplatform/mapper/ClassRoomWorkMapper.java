package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ClassRoomWork;

public interface ClassRoomWorkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ClassRoomWork record);

    int insertSelective(ClassRoomWork record);

    ClassRoomWork selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClassRoomWork record);

    int updateByPrimaryKeyWithBLOBs(ClassRoomWork record);

    int updateByPrimaryKey(ClassRoomWork record);
}