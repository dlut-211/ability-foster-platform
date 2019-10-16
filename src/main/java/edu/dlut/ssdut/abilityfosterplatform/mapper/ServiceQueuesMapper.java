package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ServiceQueues;

public interface ServiceQueuesMapper {
    int insert(ServiceQueues record);

    int insertSelective(ServiceQueues record);
}