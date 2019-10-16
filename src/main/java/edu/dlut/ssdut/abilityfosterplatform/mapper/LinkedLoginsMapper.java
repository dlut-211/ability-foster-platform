package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.LinkedLogins;

public interface LinkedLoginsMapper {
    int insert(LinkedLogins record);

    int insertSelective(LinkedLogins record);
}