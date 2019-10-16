package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ServerPrincipals;

public interface ServerPrincipalsMapper {
    int insert(ServerPrincipals record);

    int insertSelective(ServerPrincipals record);
}