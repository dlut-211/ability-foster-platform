package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.SoapEndpoints;

public interface SoapEndpointsMapper {
    int insert(SoapEndpoints record);

    int insertSelective(SoapEndpoints record);
}