package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmFtsMemoryPools;

public interface DmFtsMemoryPoolsMapper {
    int insert(DmFtsMemoryPools record);

    int insertSelective(DmFtsMemoryPools record);
}