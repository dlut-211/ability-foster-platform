package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.SysbrickfilesWithBLOBs;

public interface SysbrickfilesMapper {
    int insert(SysbrickfilesWithBLOBs record);

    int insertSelective(SysbrickfilesWithBLOBs record);
}