package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmExecQueryMemoryGrantsWithBLOBs;

public interface DmExecQueryMemoryGrantsMapper {
    int insert(DmExecQueryMemoryGrantsWithBLOBs record);

    int insertSelective(DmExecQueryMemoryGrantsWithBLOBs record);
}