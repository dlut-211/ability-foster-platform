package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Stats;

public interface StatsMapper {
    int insert(Stats record);

    int insertSelective(Stats record);
}