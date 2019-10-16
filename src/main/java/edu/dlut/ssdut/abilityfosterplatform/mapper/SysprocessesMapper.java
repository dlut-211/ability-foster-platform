package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.SysprocessesWithBLOBs;

public interface SysprocessesMapper {
    int insert(SysprocessesWithBLOBs record);

    int insertSelective(SysprocessesWithBLOBs record);
}