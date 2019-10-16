package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.IndexColumns;

public interface IndexColumnsMapper {
    int insert(IndexColumns record);

    int insertSelective(IndexColumns record);
}