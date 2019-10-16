package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmLogpoolStats;

public interface DmLogpoolStatsMapper {
    int insert(DmLogpoolStats record);

    int insertSelective(DmLogpoolStats record);
}