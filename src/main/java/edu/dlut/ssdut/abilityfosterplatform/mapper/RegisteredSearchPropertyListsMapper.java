package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.RegisteredSearchPropertyLists;

public interface RegisteredSearchPropertyListsMapper {
    int insert(RegisteredSearchPropertyLists record);

    int insertSelective(RegisteredSearchPropertyLists record);
}