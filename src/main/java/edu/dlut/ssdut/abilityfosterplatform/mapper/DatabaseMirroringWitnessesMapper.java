package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DatabaseMirroringWitnesses;

public interface DatabaseMirroringWitnessesMapper {
    int insert(DatabaseMirroringWitnesses record);

    int insertSelective(DatabaseMirroringWitnesses record);
}