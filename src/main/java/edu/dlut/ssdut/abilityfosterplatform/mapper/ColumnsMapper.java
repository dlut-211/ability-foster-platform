package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Columns;

public interface ColumnsMapper {
    int insert(Columns record);

    int insertSelective(Columns record);
}