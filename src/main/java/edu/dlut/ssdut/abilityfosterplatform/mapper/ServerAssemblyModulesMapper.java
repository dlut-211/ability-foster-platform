package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ServerAssemblyModules;

public interface ServerAssemblyModulesMapper {
    int insert(ServerAssemblyModules record);

    int insertSelective(ServerAssemblyModules record);
}