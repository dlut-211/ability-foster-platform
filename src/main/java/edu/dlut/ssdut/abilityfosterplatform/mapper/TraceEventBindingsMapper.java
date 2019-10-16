package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.TraceEventBindings;

public interface TraceEventBindingsMapper {
    int insert(TraceEventBindings record);

    int insertSelective(TraceEventBindings record);
}