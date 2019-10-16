package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.SyspermissionsWithBLOBs;

public interface SyspermissionsMapper {
    int insert(SyspermissionsWithBLOBs record);

    int insertSelective(SyspermissionsWithBLOBs record);
}