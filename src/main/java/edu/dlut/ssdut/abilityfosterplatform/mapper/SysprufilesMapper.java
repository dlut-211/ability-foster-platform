package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.SysprufilesWithBLOBs;

public interface SysprufilesMapper {
    int insert(SysprufilesWithBLOBs record);

    int insertSelective(SysprufilesWithBLOBs record);
}