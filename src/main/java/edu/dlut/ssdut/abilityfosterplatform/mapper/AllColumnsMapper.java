package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.AllColumns;

public interface AllColumnsMapper {
    int insert(AllColumns record);

    int insertSelective(AllColumns record);
}