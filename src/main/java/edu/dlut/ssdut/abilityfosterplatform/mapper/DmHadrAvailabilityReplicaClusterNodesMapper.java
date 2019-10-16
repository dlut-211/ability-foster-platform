package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmHadrAvailabilityReplicaClusterNodes;

public interface DmHadrAvailabilityReplicaClusterNodesMapper {
    int insert(DmHadrAvailabilityReplicaClusterNodes record);

    int insertSelective(DmHadrAvailabilityReplicaClusterNodes record);
}