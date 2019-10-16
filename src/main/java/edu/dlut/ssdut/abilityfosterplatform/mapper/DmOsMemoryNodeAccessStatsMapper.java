package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmOsMemoryNodeAccessStats;

public interface DmOsMemoryNodeAccessStatsMapper {
    int insert(DmOsMemoryNodeAccessStats record);

    int insertSelective(DmOsMemoryNodeAccessStats record);
}