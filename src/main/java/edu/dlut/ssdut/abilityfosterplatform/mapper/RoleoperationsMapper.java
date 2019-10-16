package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Roleoperations;

public interface RoleoperationsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Roleoperations record);

    int insertSelective(Roleoperations record);

    Roleoperations selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Roleoperations record);

    int updateByPrimaryKeyWithBLOBs(Roleoperations record);

    int updateByPrimaryKey(Roleoperations record);
}