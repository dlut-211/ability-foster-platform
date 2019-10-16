package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.FnColumnStoreRowGroups;

public interface FnColumnStoreRowGroupsMapper {
    int insert(FnColumnStoreRowGroups record);

    int insertSelective(FnColumnStoreRowGroups record);
}