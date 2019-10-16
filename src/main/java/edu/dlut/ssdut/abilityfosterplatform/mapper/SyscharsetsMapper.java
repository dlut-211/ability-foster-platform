package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.SyscharsetsWithBLOBs;

public interface SyscharsetsMapper {
    int insert(SyscharsetsWithBLOBs record);

    int insertSelective(SyscharsetsWithBLOBs record);
}