package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.TriggerEventTypes;

public interface TriggerEventTypesMapper {
    int insert(TriggerEventTypes record);

    int insertSelective(TriggerEventTypes record);
}