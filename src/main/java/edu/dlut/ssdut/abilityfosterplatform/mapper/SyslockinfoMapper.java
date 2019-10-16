package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.SyslockinfoWithBLOBs;

public interface SyslockinfoMapper {
    int insert(SyslockinfoWithBLOBs record);

    int insertSelective(SyslockinfoWithBLOBs record);
}