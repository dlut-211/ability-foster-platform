package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmClrTasksWithBLOBs;

public interface DmClrTasksMapper {
    int insert(DmClrTasksWithBLOBs record);

    int insertSelective(DmClrTasksWithBLOBs record);
}