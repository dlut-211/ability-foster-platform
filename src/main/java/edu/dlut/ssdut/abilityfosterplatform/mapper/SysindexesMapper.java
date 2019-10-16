package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.SysindexesWithBLOBs;

public interface SysindexesMapper {
    int insert(SysindexesWithBLOBs record);

    int insertSelective(SysindexesWithBLOBs record);
}