package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ServerPermissions;

public interface ServerPermissionsMapper {
    int insert(ServerPermissions record);

    int insertSelective(ServerPermissions record);
}