package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmReplTraninfoWithBLOBs;

public interface DmReplTraninfoMapper {
    int insert(DmReplTraninfoWithBLOBs record);

    int insertSelective(DmReplTraninfoWithBLOBs record);
}