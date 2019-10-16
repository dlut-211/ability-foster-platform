package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Systemoption;

public interface SystemoptionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Systemoption record);

    int insertSelective(Systemoption record);

    Systemoption selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Systemoption record);

    int updateByPrimaryKeyWithBLOBs(Systemoption record);

    int updateByPrimaryKey(Systemoption record);
}