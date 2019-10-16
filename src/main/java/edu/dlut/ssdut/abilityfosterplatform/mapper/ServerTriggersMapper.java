package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ServerTriggers;

public interface ServerTriggersMapper {
    int insert(ServerTriggers record);

    int insertSelective(ServerTriggers record);
}