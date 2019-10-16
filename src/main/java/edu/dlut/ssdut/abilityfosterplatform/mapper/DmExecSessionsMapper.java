package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmExecSessionsWithBLOBs;

public interface DmExecSessionsMapper {
    int insert(DmExecSessionsWithBLOBs record);

    int insertSelective(DmExecSessionsWithBLOBs record);
}