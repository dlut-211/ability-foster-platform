package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.TraceColumns;

public interface TraceColumnsMapper {
    int insert(TraceColumns record);

    int insertSelective(TraceColumns record);
}