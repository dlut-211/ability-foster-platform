package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmDbStatsProperties;

public interface DmDbStatsPropertiesMapper {
    int insert(DmDbStatsProperties record);

    int insertSelective(DmDbStatsProperties record);
}