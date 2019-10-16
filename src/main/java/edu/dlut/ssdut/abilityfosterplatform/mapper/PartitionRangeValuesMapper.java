package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.PartitionRangeValues;

public interface PartitionRangeValuesMapper {
    int insert(PartitionRangeValues record);

    int insertSelective(PartitionRangeValues record);
}