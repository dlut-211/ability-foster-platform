package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.TeacherRole;

public interface TeacherRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TeacherRole record);

    int insertSelective(TeacherRole record);

    TeacherRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TeacherRole record);

    int updateByPrimaryKeyWithBLOBs(TeacherRole record);

    int updateByPrimaryKey(TeacherRole record);
}