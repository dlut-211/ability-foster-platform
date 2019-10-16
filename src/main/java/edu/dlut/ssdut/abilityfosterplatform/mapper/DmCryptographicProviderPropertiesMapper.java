package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmCryptographicProviderProperties;

public interface DmCryptographicProviderPropertiesMapper {
    int insert(DmCryptographicProviderProperties record);

    int insertSelective(DmCryptographicProviderProperties record);
}