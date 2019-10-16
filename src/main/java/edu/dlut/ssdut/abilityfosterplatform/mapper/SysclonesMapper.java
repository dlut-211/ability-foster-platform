package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Sysclones;

public interface SysclonesMapper {
    int insert(Sysclones record);

    int insertSelective(Sysclones record);
}