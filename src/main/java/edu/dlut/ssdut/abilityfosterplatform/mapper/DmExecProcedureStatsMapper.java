package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmExecProcedureStatsWithBLOBs;

public interface DmExecProcedureStatsMapper {
    int insert(DmExecProcedureStatsWithBLOBs record);

    int insertSelective(DmExecProcedureStatsWithBLOBs record);
}