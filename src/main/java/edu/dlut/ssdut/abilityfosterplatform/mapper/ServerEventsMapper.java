package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ServerEvents;

public interface ServerEventsMapper {
    int insert(ServerEvents record);

    int insertSelective(ServerEvents record);
}