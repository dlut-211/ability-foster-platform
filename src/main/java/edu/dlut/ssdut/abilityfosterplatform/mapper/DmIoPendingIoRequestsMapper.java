package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmIoPendingIoRequestsWithBLOBs;

public interface DmIoPendingIoRequestsMapper {
    int insert(DmIoPendingIoRequestsWithBLOBs record);

    int insertSelective(DmIoPendingIoRequestsWithBLOBs record);
}