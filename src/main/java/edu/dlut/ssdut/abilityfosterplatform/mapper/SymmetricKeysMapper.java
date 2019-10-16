package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.SymmetricKeys;

public interface SymmetricKeysMapper {
    int insert(SymmetricKeys record);

    int insertSelective(SymmetricKeys record);
}