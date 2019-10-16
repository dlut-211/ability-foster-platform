package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.FnDumpDblogWithBLOBs;

public interface FnDumpDblogMapper {
    int insert(FnDumpDblogWithBLOBs record);

    int insertSelective(FnDumpDblogWithBLOBs record);
}