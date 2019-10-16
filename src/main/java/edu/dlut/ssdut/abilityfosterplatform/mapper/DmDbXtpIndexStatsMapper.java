package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmDbXtpIndexStats;

public interface DmDbXtpIndexStatsMapper {
    int insert(DmDbXtpIndexStats record);

    int insertSelective(DmDbXtpIndexStats record);
}