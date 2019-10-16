package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.RoleMenus;

public interface RoleMenusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RoleMenus record);

    int insertSelective(RoleMenus record);

    RoleMenus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RoleMenus record);

    int updateByPrimaryKeyWithBLOBs(RoleMenus record);

    int updateByPrimaryKey(RoleMenus record);
}