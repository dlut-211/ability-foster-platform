package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.SyscolumnsWithBLOBs;

public interface SyscolumnsMapper {
    int insert(SyscolumnsWithBLOBs record);

    int insertSelective(SyscolumnsWithBLOBs record);
}