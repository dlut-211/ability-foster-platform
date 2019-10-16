package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Studentwork;

public interface StudentworkMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Studentwork record);

    int insertSelective(Studentwork record);

    Studentwork selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Studentwork record);

    int updateByPrimaryKeyWithBLOBs(Studentwork record);

    int updateByPrimaryKey(Studentwork record);
}