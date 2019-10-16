package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.CryptographicProviders;

public interface CryptographicProvidersMapper {
    int insert(CryptographicProviders record);

    int insertSelective(CryptographicProviders record);
}