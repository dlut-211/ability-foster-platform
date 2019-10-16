package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.TraceEvents;

public interface TraceEventsMapper {
    int insert(TraceEvents record);

    int insertSelective(TraceEvents record);
}