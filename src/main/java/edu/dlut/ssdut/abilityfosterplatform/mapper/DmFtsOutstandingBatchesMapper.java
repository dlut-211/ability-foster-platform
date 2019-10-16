package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmFtsOutstandingBatchesWithBLOBs;

public interface DmFtsOutstandingBatchesMapper {
    int insert(DmFtsOutstandingBatchesWithBLOBs record);

    int insertSelective(DmFtsOutstandingBatchesWithBLOBs record);
}