package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ClassroomWork;

public interface ClassroomWorkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ClassroomWork record);

    int insertSelective(ClassroomWork record);

    ClassroomWork selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ClassroomWork record);

    int updateByPrimaryKey(ClassroomWork record);
}