package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmOsMemoryCacheEntriesWithBLOBs;

public interface DmOsMemoryCacheEntriesMapper {
    int insert(DmOsMemoryCacheEntriesWithBLOBs record);

    int insertSelective(DmOsMemoryCacheEntriesWithBLOBs record);
}