package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmOsWorkersWithBLOBs;

public interface DmOsWorkersMapper {
    int insert(DmOsWorkersWithBLOBs record);

    int insertSelective(DmOsWorkersWithBLOBs record);
}