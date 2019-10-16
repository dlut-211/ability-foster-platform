package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmDbUncontainedEntities;

public interface DmDbUncontainedEntitiesMapper {
    int insert(DmDbUncontainedEntities record);

    int insertSelective(DmDbUncontainedEntities record);
}