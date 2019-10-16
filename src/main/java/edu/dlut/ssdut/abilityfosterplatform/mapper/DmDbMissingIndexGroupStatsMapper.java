package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmDbMissingIndexGroupStats;

public interface DmDbMissingIndexGroupStatsMapper {
    int insert(DmDbMissingIndexGroupStats record);

    int insertSelective(DmDbMissingIndexGroupStats record);
}