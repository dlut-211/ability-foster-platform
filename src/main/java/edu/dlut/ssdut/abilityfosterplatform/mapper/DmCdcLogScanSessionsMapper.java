package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmCdcLogScanSessions;

public interface DmCdcLogScanSessionsMapper {
    int insert(DmCdcLogScanSessions record);

    int insertSelective(DmCdcLogScanSessions record);
}