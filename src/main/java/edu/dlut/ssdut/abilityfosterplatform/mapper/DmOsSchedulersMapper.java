package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmOsSchedulersWithBLOBs;

public interface DmOsSchedulersMapper {
    int insert(DmOsSchedulersWithBLOBs record);

    int insertSelective(DmOsSchedulersWithBLOBs record);
}