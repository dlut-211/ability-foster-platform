package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmOsPerformanceCounters;

public interface DmOsPerformanceCountersMapper {
    int insert(DmOsPerformanceCounters record);

    int insertSelective(DmOsPerformanceCounters record);
}