package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmDbXtpTableMemoryStats;

public interface DmDbXtpTableMemoryStatsMapper {
    int insert(DmDbXtpTableMemoryStats record);

    int insertSelective(DmDbXtpTableMemoryStats record);
}