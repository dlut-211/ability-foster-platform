package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmHadrDatabaseReplicaStates;

public interface DmHadrDatabaseReplicaStatesMapper {
    int insert(DmHadrDatabaseReplicaStates record);

    int insertSelective(DmHadrDatabaseReplicaStates record);
}