package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Sysfiles;

public interface SysfilesMapper {
    int insert(Sysfiles record);

    int insertSelective(Sysfiles record);
}