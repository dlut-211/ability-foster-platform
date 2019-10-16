package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ServerEventSessionEvents;

public interface ServerEventSessionEventsMapper {
    int insert(ServerEventSessionEvents record);

    int insertSelective(ServerEventSessionEvents record);
}