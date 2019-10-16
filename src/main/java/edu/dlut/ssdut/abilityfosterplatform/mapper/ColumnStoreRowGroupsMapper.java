package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ColumnStoreRowGroups;

public interface ColumnStoreRowGroupsMapper {
    int insert(ColumnStoreRowGroups record);

    int insertSelective(ColumnStoreRowGroups record);
}