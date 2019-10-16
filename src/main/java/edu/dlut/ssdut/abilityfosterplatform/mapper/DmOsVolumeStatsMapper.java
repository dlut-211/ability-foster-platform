package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmOsVolumeStats;

public interface DmOsVolumeStatsMapper {
    int insert(DmOsVolumeStats record);

    int insertSelective(DmOsVolumeStats record);
}