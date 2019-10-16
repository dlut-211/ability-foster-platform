package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ComputedColumns;

public interface ComputedColumnsMapper {
    int insert(ComputedColumns record);

    int insertSelective(ComputedColumns record);
}