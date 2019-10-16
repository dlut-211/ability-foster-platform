package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmXtpGcQueueStats;

public interface DmXtpGcQueueStatsMapper {
    int insert(DmXtpGcQueueStats record);

    int insertSelective(DmXtpGcQueueStats record);
}