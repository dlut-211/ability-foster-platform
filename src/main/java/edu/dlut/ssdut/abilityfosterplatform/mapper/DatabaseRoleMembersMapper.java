package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DatabaseRoleMembers;

public interface DatabaseRoleMembersMapper {
    int insert(DatabaseRoleMembers record);

    int insertSelective(DatabaseRoleMembers record);
}