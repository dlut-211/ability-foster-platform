package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ServerPrincipalCredentials;

public interface ServerPrincipalCredentialsMapper {
    int insert(ServerPrincipalCredentials record);

    int insertSelective(ServerPrincipalCredentials record);
}