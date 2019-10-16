package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Routines;

public interface RoutinesMapper {
    int insert(Routines record);

    int insertSelective(Routines record);
}