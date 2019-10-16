package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.UserToken;

public interface UserTokenMapper {
    int insert(UserToken record);

    int insertSelective(UserToken record);
}