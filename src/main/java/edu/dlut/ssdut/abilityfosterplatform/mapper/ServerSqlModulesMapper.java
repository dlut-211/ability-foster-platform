package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ServerSqlModules;

public interface ServerSqlModulesMapper {
    int insert(ServerSqlModules record);

    int insertSelective(ServerSqlModules record);
}