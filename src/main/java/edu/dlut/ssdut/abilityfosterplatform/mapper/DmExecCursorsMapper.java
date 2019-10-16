package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmExecCursorsWithBLOBs;

public interface DmExecCursorsMapper {
    int insert(DmExecCursorsWithBLOBs record);

    int insertSelective(DmExecCursorsWithBLOBs record);
}