package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmOsMemoryAllocationsWithBLOBs;

public interface DmOsMemoryAllocationsMapper {
    int insert(DmOsMemoryAllocationsWithBLOBs record);

    int insertSelective(DmOsMemoryAllocationsWithBLOBs record);
}