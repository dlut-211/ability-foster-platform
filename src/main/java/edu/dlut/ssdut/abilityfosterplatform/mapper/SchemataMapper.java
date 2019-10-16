package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Schemata;

public interface SchemataMapper {
    int insert(Schemata record);

    int insertSelective(Schemata record);
}