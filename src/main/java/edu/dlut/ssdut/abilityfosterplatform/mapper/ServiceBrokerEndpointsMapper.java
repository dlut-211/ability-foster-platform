package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ServiceBrokerEndpoints;

public interface ServiceBrokerEndpointsMapper {
    int insert(ServiceBrokerEndpoints record);

    int insertSelective(ServiceBrokerEndpoints record);
}