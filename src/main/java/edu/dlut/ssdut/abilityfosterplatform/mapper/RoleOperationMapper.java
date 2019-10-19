package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.RoleOperation;

public interface RoleOperationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RoleOperation record);

    int insertSelective(RoleOperation record);

    RoleOperation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RoleOperation record);

    int updateByPrimaryKey(RoleOperation record);
}