package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.SyscertsWithBLOBs;

public interface SyscertsMapper {
    int insert(SyscertsWithBLOBs record);

    int insertSelective(SyscertsWithBLOBs record);
}