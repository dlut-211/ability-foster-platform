package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.EndpointWebmethods;

public interface EndpointWebmethodsMapper {
    int insert(EndpointWebmethods record);

    int insertSelective(EndpointWebmethods record);
}