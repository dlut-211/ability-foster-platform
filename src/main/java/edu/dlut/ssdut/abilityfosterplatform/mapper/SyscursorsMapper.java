package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Syscursors;

public interface SyscursorsMapper {
    int insert(Syscursors record);

    int insertSelective(Syscursors record);
}