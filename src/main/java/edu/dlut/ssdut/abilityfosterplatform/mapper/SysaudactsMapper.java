package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Sysaudacts;

public interface SysaudactsMapper {
    int insert(Sysaudacts record);

    int insertSelective(Sysaudacts record);
}