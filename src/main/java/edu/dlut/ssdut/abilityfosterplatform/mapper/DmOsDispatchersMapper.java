package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmOsDispatchersWithBLOBs;

public interface DmOsDispatchersMapper {
    int insert(DmOsDispatchersWithBLOBs record);

    int insertSelective(DmOsDispatchersWithBLOBs record);
}