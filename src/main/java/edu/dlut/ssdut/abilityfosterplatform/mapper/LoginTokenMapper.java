package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.LoginToken;

public interface LoginTokenMapper {
    int insert(LoginToken record);

    int insertSelective(LoginToken record);
}