package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.SystemInternalsAllocationUnitsWithBLOBs;

public interface SystemInternalsAllocationUnitsMapper {
    int insert(SystemInternalsAllocationUnitsWithBLOBs record);

    int insertSelective(SystemInternalsAllocationUnitsWithBLOBs record);
}