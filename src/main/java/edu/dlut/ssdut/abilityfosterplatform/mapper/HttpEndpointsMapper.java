package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.HttpEndpoints;

public interface HttpEndpointsMapper {
    int insert(HttpEndpoints record);

    int insertSelective(HttpEndpoints record);
}