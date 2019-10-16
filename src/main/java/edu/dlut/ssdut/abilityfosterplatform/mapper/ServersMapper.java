package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Servers;

public interface ServersMapper {
    int insert(Servers record);

    int insertSelective(Servers record);
}