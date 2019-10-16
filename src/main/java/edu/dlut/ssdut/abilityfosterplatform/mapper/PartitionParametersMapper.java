package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.PartitionParameters;

public interface PartitionParametersMapper {
    int insert(PartitionParameters record);

    int insertSelective(PartitionParameters record);
}