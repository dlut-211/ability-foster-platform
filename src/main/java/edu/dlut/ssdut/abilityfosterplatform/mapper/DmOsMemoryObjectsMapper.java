package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmOsMemoryObjectsWithBLOBs;

public interface DmOsMemoryObjectsMapper {
    int insert(DmOsMemoryObjectsWithBLOBs record);

    int insertSelective(DmOsMemoryObjectsWithBLOBs record);
}