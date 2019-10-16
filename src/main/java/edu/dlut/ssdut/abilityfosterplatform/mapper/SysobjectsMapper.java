package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Sysobjects;

public interface SysobjectsMapper {
    int insert(Sysobjects record);

    int insertSelective(Sysobjects record);
}