package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmExecConnections;

public interface DmExecConnectionsMapper {
    int insert(DmExecConnections record);

    int insertSelective(DmExecConnections record);
}