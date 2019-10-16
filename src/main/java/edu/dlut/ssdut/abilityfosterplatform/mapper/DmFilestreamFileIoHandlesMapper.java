package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmFilestreamFileIoHandlesWithBLOBs;

public interface DmFilestreamFileIoHandlesMapper {
    int insert(DmFilestreamFileIoHandlesWithBLOBs record);

    int insertSelective(DmFilestreamFileIoHandlesWithBLOBs record);
}