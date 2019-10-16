package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.SysownersWithBLOBs;

public interface SysownersMapper {
    int insert(SysownersWithBLOBs record);

    int insertSelective(SysownersWithBLOBs record);
}