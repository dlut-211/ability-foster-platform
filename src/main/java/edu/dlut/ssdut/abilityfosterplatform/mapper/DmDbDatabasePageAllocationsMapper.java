package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmDbDatabasePageAllocations;

public interface DmDbDatabasePageAllocationsMapper {
    int insert(DmDbDatabasePageAllocations record);

    int insertSelective(DmDbDatabasePageAllocations record);
}