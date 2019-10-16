package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmDbIndexOperationalStats;

public interface DmDbIndexOperationalStatsMapper {
    int insert(DmDbIndexOperationalStats record);

    int insertSelective(DmDbIndexOperationalStats record);
}