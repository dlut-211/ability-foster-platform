package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.TraceSubclassValues;

public interface TraceSubclassValuesMapper {
    int insert(TraceSubclassValues record);

    int insertSelective(TraceSubclassValues record);
}