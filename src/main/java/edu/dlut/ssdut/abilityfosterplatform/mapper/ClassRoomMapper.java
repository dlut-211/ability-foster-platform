package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ClassRoom;

public interface ClassRoomMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ClassRoom record);

    int insertSelective(ClassRoom record);

    ClassRoom selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClassRoom record);

    int updateByPrimaryKeyWithBLOBs(ClassRoom record);

    int updateByPrimaryKey(ClassRoom record);
}