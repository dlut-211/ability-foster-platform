package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Sysqnames;

public interface SysqnamesMapper {
    int insert(Sysqnames record);

    int insertSelective(Sysqnames record);
}