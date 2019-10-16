package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.KeyEncryptionsWithBLOBs;

public interface KeyEncryptionsMapper {
    int insert(KeyEncryptionsWithBLOBs record);

    int insertSelective(KeyEncryptionsWithBLOBs record);
}