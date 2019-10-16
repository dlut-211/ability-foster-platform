package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmDbIndexPhysicalStats;

public interface DmDbIndexPhysicalStatsMapper {
    int insert(DmDbIndexPhysicalStats record);

    int insertSelective(DmDbIndexPhysicalStats record);
}