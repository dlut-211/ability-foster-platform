package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.SysasymkeysWithBLOBs;

public interface SysasymkeysMapper {
    int insert(SysasymkeysWithBLOBs record);

    int insertSelective(SysasymkeysWithBLOBs record);
}