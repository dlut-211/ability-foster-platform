package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.SysobjkeycryptsWithBLOBs;

public interface SysobjkeycryptsMapper {
    int insert(SysobjkeycryptsWithBLOBs record);

    int insertSelective(SysobjkeycryptsWithBLOBs record);
}