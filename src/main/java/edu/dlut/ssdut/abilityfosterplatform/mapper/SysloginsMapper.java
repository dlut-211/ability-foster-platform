package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Syslogins;

public interface SysloginsMapper {
    int insert(Syslogins record);

    int insertSelective(Syslogins record);
}