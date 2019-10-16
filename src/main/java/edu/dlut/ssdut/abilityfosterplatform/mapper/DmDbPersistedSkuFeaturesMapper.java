package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmDbPersistedSkuFeatures;

public interface DmDbPersistedSkuFeaturesMapper {
    int insert(DmDbPersistedSkuFeatures record);

    int insertSelective(DmDbPersistedSkuFeatures record);
}