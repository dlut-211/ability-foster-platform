package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.PartitionFunctions;

public interface PartitionFunctionsMapper {
    int insert(PartitionFunctions record);

    int insertSelective(PartitionFunctions record);
}