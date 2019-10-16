package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ForeignKeys;

public interface ForeignKeysMapper {
    int insert(ForeignKeys record);

    int insertSelective(ForeignKeys record);
}