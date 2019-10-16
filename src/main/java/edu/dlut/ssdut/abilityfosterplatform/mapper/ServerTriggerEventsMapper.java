package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ServerTriggerEvents;

public interface ServerTriggerEventsMapper {
    int insert(ServerTriggerEvents record);

    int insertSelective(ServerTriggerEvents record);
}