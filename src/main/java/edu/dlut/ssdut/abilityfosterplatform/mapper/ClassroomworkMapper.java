package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Classroomwork;

public interface ClassroomworkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Classroomwork record);

    int insertSelective(Classroomwork record);

    Classroomwork selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Classroomwork record);

    int updateByPrimaryKeyWithBLOBs(Classroomwork record);

    int updateByPrimaryKey(Classroomwork record);
}