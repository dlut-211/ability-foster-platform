package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.FulltextIndexColumns;

public interface FulltextIndexColumnsMapper {
    int insert(FulltextIndexColumns record);

    int insertSelective(FulltextIndexColumns record);
}