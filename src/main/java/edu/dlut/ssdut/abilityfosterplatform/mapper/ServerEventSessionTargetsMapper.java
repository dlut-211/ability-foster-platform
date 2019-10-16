package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ServerEventSessionTargets;

public interface ServerEventSessionTargetsMapper {
    int insert(ServerEventSessionTargets record);

    int insertSelective(ServerEventSessionTargets record);
}