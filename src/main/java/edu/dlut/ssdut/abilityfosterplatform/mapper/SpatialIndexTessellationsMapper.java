package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.SpatialIndexTessellations;

public interface SpatialIndexTessellationsMapper {
    int insert(SpatialIndexTessellations record);

    int insertSelective(SpatialIndexTessellations record);
}