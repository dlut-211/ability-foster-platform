package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmCryptographicProviderKeys;

public interface DmCryptographicProviderKeysMapper {
    int insert(DmCryptographicProviderKeys record);

    int insertSelective(DmCryptographicProviderKeys record);
}