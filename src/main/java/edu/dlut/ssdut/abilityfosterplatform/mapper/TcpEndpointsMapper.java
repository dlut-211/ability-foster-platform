package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.TcpEndpoints;

public interface TcpEndpointsMapper {
    int insert(TcpEndpoints record);

    int insertSelective(TcpEndpoints record);
}