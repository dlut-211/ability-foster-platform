package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmFtsIndexPopulationWithBLOBs;

public interface DmFtsIndexPopulationMapper {
    int insert(DmFtsIndexPopulationWithBLOBs record);

    int insertSelective(DmFtsIndexPopulationWithBLOBs record);
}