package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.FulltextIndexes;

public interface FulltextIndexesMapper {
    int insert(FulltextIndexes record);

    int insertSelective(FulltextIndexes record);
}