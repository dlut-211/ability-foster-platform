package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.SysxlgnsWithBLOBs;

public interface SysxlgnsMapper {
    int insert(SysxlgnsWithBLOBs record);

    int insertSelective(SysxlgnsWithBLOBs record);
}