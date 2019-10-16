package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Schemas;

public interface SchemasMapper {
    int insert(Schemas record);

    int insertSelective(Schemas record);
}