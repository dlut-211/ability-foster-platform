package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.MasterKeyPasswords;

public interface MasterKeyPasswordsMapper {
    int insert(MasterKeyPasswords record);

    int insertSelective(MasterKeyPasswords record);
}