package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.SysallocunitsWithBLOBs;

public interface SysallocunitsMapper {
    int insert(SysallocunitsWithBLOBs record);

    int insertSelective(SysallocunitsWithBLOBs record);
}