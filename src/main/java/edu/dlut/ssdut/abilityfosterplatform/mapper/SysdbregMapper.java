package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Sysdbreg;

public interface SysdbregMapper {
    int insert(Sysdbreg record);

    int insertSelective(Sysdbreg record);
}