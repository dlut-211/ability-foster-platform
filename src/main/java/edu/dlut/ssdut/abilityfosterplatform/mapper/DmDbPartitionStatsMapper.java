package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmDbPartitionStats;

public interface DmDbPartitionStatsMapper {
    int insert(DmDbPartitionStats record);

    int insertSelective(DmDbPartitionStats record);
}