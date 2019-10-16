package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmBrokerConnections;

public interface DmBrokerConnectionsMapper {
    int insert(DmBrokerConnections record);

    int insertSelective(DmBrokerConnections record);
}