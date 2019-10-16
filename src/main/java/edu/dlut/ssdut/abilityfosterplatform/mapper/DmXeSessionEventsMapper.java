package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmXeSessionEvents;

public interface DmXeSessionEventsMapper {
    int insert(DmXeSessionEvents record);

    int insertSelective(DmXeSessionEvents record);
}