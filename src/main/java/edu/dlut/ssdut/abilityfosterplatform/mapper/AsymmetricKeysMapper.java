package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.AsymmetricKeysWithBLOBs;

public interface AsymmetricKeysMapper {
    int insert(AsymmetricKeysWithBLOBs record);

    int insertSelective(AsymmetricKeysWithBLOBs record);
}