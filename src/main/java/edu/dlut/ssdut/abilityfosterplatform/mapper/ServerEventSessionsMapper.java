package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ServerEventSessions;

public interface ServerEventSessionsMapper {
    int insert(ServerEventSessions record);

    int insertSelective(ServerEventSessions record);
}