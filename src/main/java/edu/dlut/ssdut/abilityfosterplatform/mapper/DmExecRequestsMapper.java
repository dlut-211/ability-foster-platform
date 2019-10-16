package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmExecRequestsWithBLOBs;

public interface DmExecRequestsMapper {
    int insert(DmExecRequestsWithBLOBs record);

    int insertSelective(DmExecRequestsWithBLOBs record);
}