package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmIoVirtualFileStats;

public interface DmIoVirtualFileStatsMapper {
    int insert(DmIoVirtualFileStats record);

    int insertSelective(DmIoVirtualFileStats record);
}