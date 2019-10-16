package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmDbFtsIndexPhysicalStats;

public interface DmDbFtsIndexPhysicalStatsMapper {
    int insert(DmDbFtsIndexPhysicalStats record);

    int insertSelective(DmDbFtsIndexPhysicalStats record);
}