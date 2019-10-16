package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmExecQueryProfilesWithBLOBs;

public interface DmExecQueryProfilesMapper {
    int insert(DmExecQueryProfilesWithBLOBs record);

    int insertSelective(DmExecQueryProfilesWithBLOBs record);
}