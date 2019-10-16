package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.SpatialIndexes;

public interface SpatialIndexesMapper {
    int insert(SpatialIndexes record);

    int insertSelective(SpatialIndexes record);
}