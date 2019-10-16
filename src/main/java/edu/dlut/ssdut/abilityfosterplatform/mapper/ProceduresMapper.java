package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Procedures;

public interface ProceduresMapper {
    int insert(Procedures record);

    int insertSelective(Procedures record);
}