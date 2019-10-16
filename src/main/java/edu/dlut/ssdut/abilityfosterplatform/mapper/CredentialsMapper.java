package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Credentials;

public interface CredentialsMapper {
    int insert(Credentials record);

    int insertSelective(Credentials record);
}