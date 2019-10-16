package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.StudentWorkDetail;

public interface StudentWorkDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentWorkDetail record);

    int insertSelective(StudentWorkDetail record);

    StudentWorkDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentWorkDetail record);

    int updateByPrimaryKeyWithBLOBs(StudentWorkDetail record);

    int updateByPrimaryKey(StudentWorkDetail record);
}