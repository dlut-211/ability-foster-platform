package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.FnTraceGettableWithBLOBs;

public interface FnTraceGettableMapper {
    int insert(FnTraceGettableWithBLOBs record);

    int insertSelective(FnTraceGettableWithBLOBs record);
}