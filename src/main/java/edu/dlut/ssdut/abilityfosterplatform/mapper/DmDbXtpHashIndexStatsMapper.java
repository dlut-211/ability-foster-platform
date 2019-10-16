package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmDbXtpHashIndexStats;

public interface DmDbXtpHashIndexStatsMapper {
    int insert(DmDbXtpHashIndexStats record);

    int insertSelective(DmDbXtpHashIndexStats record);
}