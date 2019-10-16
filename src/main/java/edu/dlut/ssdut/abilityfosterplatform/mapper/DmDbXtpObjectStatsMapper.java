package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmDbXtpObjectStats;

public interface DmDbXtpObjectStatsMapper {
    int insert(DmDbXtpObjectStats record);

    int insertSelective(DmDbXtpObjectStats record);
}