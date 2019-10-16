package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmOsThreadsWithBLOBs;

public interface DmOsThreadsMapper {
    int insert(DmOsThreadsWithBLOBs record);

    int insertSelective(DmOsThreadsWithBLOBs record);
}