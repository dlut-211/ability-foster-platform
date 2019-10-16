package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.CryptPropertiesWithBLOBs;

public interface CryptPropertiesMapper {
    int insert(CryptPropertiesWithBLOBs record);

    int insertSelective(CryptPropertiesWithBLOBs record);
}