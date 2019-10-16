package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.TriggerEvents;

public interface TriggerEventsMapper {
    int insert(TriggerEvents record);

    int insertSelective(TriggerEvents record);
}