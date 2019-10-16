package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmSqlReferencedEntities;

public interface DmSqlReferencedEntitiesMapper {
    int insert(DmSqlReferencedEntities record);

    int insertSelective(DmSqlReferencedEntities record);
}