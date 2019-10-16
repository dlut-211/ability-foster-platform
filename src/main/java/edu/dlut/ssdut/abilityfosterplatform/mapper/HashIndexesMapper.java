package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.HashIndexes;

public interface HashIndexesMapper {
    int insert(HashIndexes record);

    int insertSelective(HashIndexes record);
}