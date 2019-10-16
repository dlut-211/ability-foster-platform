package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.SysftindsWithBLOBs;

public interface SysftindsMapper {
    int insert(SysftindsWithBLOBs record);

    int insertSelective(SysftindsWithBLOBs record);
}