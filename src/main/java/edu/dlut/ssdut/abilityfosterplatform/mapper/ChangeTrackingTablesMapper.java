package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ChangeTrackingTables;

public interface ChangeTrackingTablesMapper {
    int insert(ChangeTrackingTables record);

    int insertSelective(ChangeTrackingTables record);
}