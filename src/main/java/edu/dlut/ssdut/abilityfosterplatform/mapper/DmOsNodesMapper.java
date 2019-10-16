package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmOsNodesWithBLOBs;

public interface DmOsNodesMapper {
    int insert(DmOsNodesWithBLOBs record);

    int insertSelective(DmOsNodesWithBLOBs record);
}