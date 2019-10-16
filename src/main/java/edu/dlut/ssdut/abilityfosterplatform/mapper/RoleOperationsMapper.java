package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.RoleOperations;

public interface RoleOperationsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RoleOperations record);

    int insertSelective(RoleOperations record);

    RoleOperations selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RoleOperations record);

    int updateByPrimaryKeyWithBLOBs(RoleOperations record);

    int updateByPrimaryKey(RoleOperations record);
}