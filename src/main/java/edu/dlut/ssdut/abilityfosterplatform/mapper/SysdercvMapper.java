package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.SysdercvWithBLOBs;

public interface SysdercvMapper {
    int insert(SysdercvWithBLOBs record);

    int insertSelective(SysdercvWithBLOBs record);
}