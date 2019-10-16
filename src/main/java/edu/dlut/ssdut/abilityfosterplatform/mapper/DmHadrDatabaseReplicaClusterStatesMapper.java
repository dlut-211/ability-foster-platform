package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmHadrDatabaseReplicaClusterStates;

public interface DmHadrDatabaseReplicaClusterStatesMapper {
    int insert(DmHadrDatabaseReplicaClusterStates record);

    int insertSelective(DmHadrDatabaseReplicaClusterStates record);
}