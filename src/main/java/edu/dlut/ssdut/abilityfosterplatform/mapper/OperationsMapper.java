package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Operations;

public interface OperationsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Operations record);

    int insertSelective(Operations record);

    Operations selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Operations record);

    int updateByPrimaryKeyWithBLOBs(Operations record);

    int updateByPrimaryKey(Operations record);
}