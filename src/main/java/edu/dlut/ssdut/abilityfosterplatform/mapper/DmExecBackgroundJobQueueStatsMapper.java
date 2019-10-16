package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmExecBackgroundJobQueueStats;

public interface DmExecBackgroundJobQueueStatsMapper {
    int insert(DmExecBackgroundJobQueueStats record);

    int insertSelective(DmExecBackgroundJobQueueStats record);
}