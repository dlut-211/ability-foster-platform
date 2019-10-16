package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmCryptographicProviderSessions;

public interface DmCryptographicProviderSessionsMapper {
    int insert(DmCryptographicProviderSessions record);

    int insertSelective(DmCryptographicProviderSessions record);
}