package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmOsMemoryPools;

public interface DmOsMemoryPoolsMapper {
    int insert(DmOsMemoryPools record);

    int insertSelective(DmOsMemoryPools record);
}