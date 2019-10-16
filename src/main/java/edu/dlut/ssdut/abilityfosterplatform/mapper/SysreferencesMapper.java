package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.SysreferencesWithBLOBs;

public interface SysreferencesMapper {
    int insert(SysreferencesWithBLOBs record);

    int insertSelective(SysreferencesWithBLOBs record);
}