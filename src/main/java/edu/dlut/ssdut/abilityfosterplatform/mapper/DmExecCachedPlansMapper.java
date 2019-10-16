package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmExecCachedPlansWithBLOBs;

public interface DmExecCachedPlansMapper {
    int insert(DmExecCachedPlansWithBLOBs record);

    int insertSelective(DmExecCachedPlansWithBLOBs record);
}