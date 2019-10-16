package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Sysconstraints;

public interface SysconstraintsMapper {
    int insert(Sysconstraints record);

    int insertSelective(Sysconstraints record);
}