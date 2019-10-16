package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmOsLoadedModules;

public interface DmOsLoadedModulesMapper {
    int insert(DmOsLoadedModules record);

    int insertSelective(DmOsLoadedModules record);
}