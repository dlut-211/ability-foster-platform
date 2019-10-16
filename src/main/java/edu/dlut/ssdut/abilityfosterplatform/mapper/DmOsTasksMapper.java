package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmOsTasksWithBLOBs;

public interface DmOsTasksMapper {
    int insert(DmOsTasksWithBLOBs record);

    int insertSelective(DmOsTasksWithBLOBs record);
}