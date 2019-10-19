package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.StudentRole;

public interface StudentRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentRole record);

    int insertSelective(StudentRole record);

    StudentRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentRole record);

    int updateByPrimaryKey(StudentRole record);
}