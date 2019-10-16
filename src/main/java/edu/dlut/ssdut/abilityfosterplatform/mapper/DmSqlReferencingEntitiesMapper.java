package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmSqlReferencingEntities;

public interface DmSqlReferencingEntitiesMapper {
    int insert(DmSqlReferencingEntities record);

    int insertSelective(DmSqlReferencingEntities record);
}