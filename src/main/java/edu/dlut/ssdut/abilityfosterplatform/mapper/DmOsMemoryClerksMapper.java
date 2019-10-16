package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmOsMemoryClerksWithBLOBs;

public interface DmOsMemoryClerksMapper {
    int insert(DmOsMemoryClerksWithBLOBs record);

    int insertSelective(DmOsMemoryClerksWithBLOBs record);
}