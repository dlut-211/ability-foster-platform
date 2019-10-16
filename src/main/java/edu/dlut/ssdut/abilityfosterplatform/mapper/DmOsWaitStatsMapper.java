package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmOsWaitStats;

public interface DmOsWaitStatsMapper {
    int insert(DmOsWaitStats record);

    int insertSelective(DmOsWaitStats record);
}