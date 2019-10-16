package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmDbXtpCheckpointStats;

public interface DmDbXtpCheckpointStatsMapper {
    int insert(DmDbXtpCheckpointStats record);

    int insertSelective(DmDbXtpCheckpointStats record);
}