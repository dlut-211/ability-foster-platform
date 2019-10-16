package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Migrationhistory;
import edu.dlut.ssdut.abilityfosterplatform.model.MigrationhistoryKey;

public interface MigrationhistoryMapper {
    int deleteByPrimaryKey(MigrationhistoryKey key);

    int insert(Migrationhistory record);

    int insertSelective(Migrationhistory record);

    Migrationhistory selectByPrimaryKey(MigrationhistoryKey key);

    int updateByPrimaryKeySelective(Migrationhistory record);

    int updateByPrimaryKeyWithBLOBs(Migrationhistory record);

    int updateByPrimaryKey(Migrationhistory record);
}