package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmOsHostsWithBLOBs;

public interface DmOsHostsMapper {
    int insert(DmOsHostsWithBLOBs record);

    int insertSelective(DmOsHostsWithBLOBs record);
}