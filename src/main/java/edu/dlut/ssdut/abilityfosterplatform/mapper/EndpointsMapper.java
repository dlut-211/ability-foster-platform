package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Endpoints;

public interface EndpointsMapper {
    int insert(Endpoints record);

    int insertSelective(Endpoints record);
}