package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.RemoteLogins;

public interface RemoteLoginsMapper {
    int insert(RemoteLogins record);

    int insertSelective(RemoteLogins record);
}