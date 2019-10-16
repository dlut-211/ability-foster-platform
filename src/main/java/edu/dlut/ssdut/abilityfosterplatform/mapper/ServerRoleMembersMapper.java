package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ServerRoleMembers;

public interface ServerRoleMembersMapper {
    int insert(ServerRoleMembers record);

    int insertSelective(ServerRoleMembers record);
}