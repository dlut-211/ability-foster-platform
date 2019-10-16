package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmFilestreamNonTransactedHandlesWithBLOBs;

public interface DmFilestreamNonTransactedHandlesMapper {
    int insert(DmFilestreamNonTransactedHandlesWithBLOBs record);

    int insertSelective(DmFilestreamNonTransactedHandlesWithBLOBs record);
}