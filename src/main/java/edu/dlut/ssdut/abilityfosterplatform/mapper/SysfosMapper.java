package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.SysfosWithBLOBs;

public interface SysfosMapper {
    int insert(SysfosWithBLOBs record);

    int insertSelective(SysfosWithBLOBs record);
}