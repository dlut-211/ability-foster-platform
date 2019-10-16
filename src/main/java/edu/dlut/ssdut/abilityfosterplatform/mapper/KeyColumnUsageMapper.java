package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.KeyColumnUsage;

public interface KeyColumnUsageMapper {
    int insert(KeyColumnUsage record);

    int insertSelective(KeyColumnUsage record);
}