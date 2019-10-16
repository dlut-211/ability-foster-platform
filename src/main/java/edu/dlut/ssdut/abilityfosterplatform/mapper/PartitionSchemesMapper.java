package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.PartitionSchemes;

public interface PartitionSchemesMapper {
    int insert(PartitionSchemes record);

    int insertSelective(PartitionSchemes record);
}