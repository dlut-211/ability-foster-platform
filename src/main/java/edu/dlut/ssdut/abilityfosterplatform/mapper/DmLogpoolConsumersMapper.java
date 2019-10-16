package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmLogpoolConsumersWithBLOBs;

public interface DmLogpoolConsumersMapper {
    int insert(DmLogpoolConsumersWithBLOBs record);

    int insertSelective(DmLogpoolConsumersWithBLOBs record);
}