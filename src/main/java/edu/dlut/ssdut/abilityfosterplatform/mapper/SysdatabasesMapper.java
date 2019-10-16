package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Sysdatabases;

public interface SysdatabasesMapper {
    int insert(Sysdatabases record);

    int insertSelective(Sysdatabases record);
}