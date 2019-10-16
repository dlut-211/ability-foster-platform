package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmExecQueryStatsWithBLOBs;

public interface DmExecQueryStatsMapper {
    int insert(DmExecQueryStatsWithBLOBs record);

    int insertSelective(DmExecQueryStatsWithBLOBs record);
}