package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmDbXtpNonclusteredIndexStats;

public interface DmDbXtpNonclusteredIndexStatsMapper {
    int insert(DmDbXtpNonclusteredIndexStats record);

    int insertSelective(DmDbXtpNonclusteredIndexStats record);
}