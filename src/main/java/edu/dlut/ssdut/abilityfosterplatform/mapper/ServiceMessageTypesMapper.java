package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ServiceMessageTypes;

public interface ServiceMessageTypesMapper {
    int insert(ServiceMessageTypes record);

    int insertSelective(ServiceMessageTypes record);
}