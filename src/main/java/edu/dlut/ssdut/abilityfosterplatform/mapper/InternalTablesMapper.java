package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.InternalTables;

public interface InternalTablesMapper {
    int insert(InternalTables record);

    int insertSelective(InternalTables record);
}