package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DatabaseMirroringEndpoints;

public interface DatabaseMirroringEndpointsMapper {
    int insert(DatabaseMirroringEndpoints record);

    int insertSelective(DatabaseMirroringEndpoints record);
}