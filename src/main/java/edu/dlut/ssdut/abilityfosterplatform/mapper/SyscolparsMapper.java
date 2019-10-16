package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Syscolpars;

public interface SyscolparsMapper {
    int insert(Syscolpars record);

    int insertSelective(Syscolpars record);
}