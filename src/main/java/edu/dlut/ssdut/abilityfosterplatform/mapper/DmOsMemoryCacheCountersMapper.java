package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmOsMemoryCacheCounters;

public interface DmOsMemoryCacheCountersMapper {
    int insert(DmOsMemoryCacheCounters record);

    int insertSelective(DmOsMemoryCacheCounters record);
}