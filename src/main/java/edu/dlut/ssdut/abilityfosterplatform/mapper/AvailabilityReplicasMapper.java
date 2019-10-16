package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.AvailabilityReplicas;

public interface AvailabilityReplicasMapper {
    int insert(AvailabilityReplicas record);

    int insertSelective(AvailabilityReplicas record);
}