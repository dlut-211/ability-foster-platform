package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmFtsPopulationRangesWithBLOBs;

public interface DmFtsPopulationRangesMapper {
    int insert(DmFtsPopulationRangesWithBLOBs record);

    int insertSelective(DmFtsPopulationRangesWithBLOBs record);
}