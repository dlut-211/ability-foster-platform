package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmDbMirroringConnections;

public interface DmDbMirroringConnectionsMapper {
    int insert(DmDbMirroringConnections record);

    int insertSelective(DmDbMirroringConnections record);
}