package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.AllocationUnits;

public interface AllocationUnitsMapper {
    int insert(AllocationUnits record);

    int insertSelective(AllocationUnits record);
}