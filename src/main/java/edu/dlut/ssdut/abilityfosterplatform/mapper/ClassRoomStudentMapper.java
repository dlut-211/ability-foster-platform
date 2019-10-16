package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ClassRoomStudent;

public interface ClassRoomStudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ClassRoomStudent record);

    int insertSelective(ClassRoomStudent record);

    ClassRoomStudent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClassRoomStudent record);

    int updateByPrimaryKeyWithBLOBs(ClassRoomStudent record);

    int updateByPrimaryKey(ClassRoomStudent record);
}