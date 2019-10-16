package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmServerMemoryDumps;

public interface DmServerMemoryDumpsMapper {
    int insert(DmServerMemoryDumps record);

    int insertSelective(DmServerMemoryDumps record);
}