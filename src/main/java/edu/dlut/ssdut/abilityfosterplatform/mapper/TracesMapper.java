package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Traces;

public interface TracesMapper {
    int insert(Traces record);

    int insertSelective(Traces record);
}