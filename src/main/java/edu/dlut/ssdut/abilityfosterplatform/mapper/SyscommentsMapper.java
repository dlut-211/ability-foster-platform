package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Syscomments;

public interface SyscommentsMapper {
    int insert(Syscomments record);

    int insertSelective(Syscomments record);
}