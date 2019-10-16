package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.SysusersWithBLOBs;

public interface SysusersMapper {
    int insert(SysusersWithBLOBs record);

    int insertSelective(SysusersWithBLOBs record);
}