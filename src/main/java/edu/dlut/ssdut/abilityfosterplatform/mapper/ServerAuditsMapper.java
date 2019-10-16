package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ServerAudits;

public interface ServerAuditsMapper {
    int insert(ServerAudits record);

    int insertSelective(ServerAudits record);
}