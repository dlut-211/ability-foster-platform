package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmDatabaseEncryptionKeys;

public interface DmDatabaseEncryptionKeysMapper {
    int insert(DmDatabaseEncryptionKeys record);

    int insertSelective(DmDatabaseEncryptionKeys record);
}