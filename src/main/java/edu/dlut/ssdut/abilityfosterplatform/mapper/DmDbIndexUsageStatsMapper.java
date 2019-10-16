package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmDbIndexUsageStats;

public interface DmDbIndexUsageStatsMapper {
    int insert(DmDbIndexUsageStats record);

    int insertSelective(DmDbIndexUsageStats record);
}