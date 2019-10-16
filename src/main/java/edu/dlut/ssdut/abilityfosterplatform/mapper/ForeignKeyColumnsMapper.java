package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ForeignKeyColumns;

public interface ForeignKeyColumnsMapper {
    int insert(ForeignKeyColumns record);

    int insertSelective(ForeignKeyColumns record);
}