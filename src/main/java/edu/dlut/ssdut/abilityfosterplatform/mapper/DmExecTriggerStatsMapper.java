package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmExecTriggerStatsWithBLOBs;

public interface DmExecTriggerStatsMapper {
    int insert(DmExecTriggerStatsWithBLOBs record);

    int insertSelective(DmExecTriggerStatsWithBLOBs record);
}