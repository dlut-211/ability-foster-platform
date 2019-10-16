package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ColumnStoreDictionaries;

public interface ColumnStoreDictionariesMapper {
    int insert(ColumnStoreDictionaries record);

    int insertSelective(ColumnStoreDictionaries record);
}