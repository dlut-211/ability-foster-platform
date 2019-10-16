package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ServiceQueueUsages;

public interface ServiceQueueUsagesMapper {
    int insert(ServiceQueueUsages record);

    int insertSelective(ServiceQueueUsages record);
}