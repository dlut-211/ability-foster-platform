package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.StudentWork;

public interface StudentWorkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentWork record);

    int insertSelective(StudentWork record);

    StudentWork selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentWork record);

    int updateByPrimaryKey(StudentWork record);
}
