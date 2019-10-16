package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DatabasePermissions;

public interface DatabasePermissionsMapper {
    int insert(DatabasePermissions record);

    int insertSelective(DatabasePermissions record);
}