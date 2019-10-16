package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmFilestreamFileIoRequestsWithBLOBs;

public interface DmFilestreamFileIoRequestsMapper {
    int insert(DmFilestreamFileIoRequestsWithBLOBs record);

    int insertSelective(DmFilestreamFileIoRequestsWithBLOBs record);
}