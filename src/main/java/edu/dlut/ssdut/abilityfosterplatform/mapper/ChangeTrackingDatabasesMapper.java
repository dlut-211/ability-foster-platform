package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ChangeTrackingDatabases;

public interface ChangeTrackingDatabasesMapper {
    int insert(ChangeTrackingDatabases record);

    int insertSelective(ChangeTrackingDatabases record);
}