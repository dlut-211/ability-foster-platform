package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.SpatialReferenceSystems;

public interface SpatialReferenceSystemsMapper {
    int insert(SpatialReferenceSystems record);

    int insertSelective(SpatialReferenceSystems record);
}