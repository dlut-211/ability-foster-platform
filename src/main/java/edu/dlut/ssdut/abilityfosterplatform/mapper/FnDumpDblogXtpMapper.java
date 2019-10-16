package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.FnDumpDblogXtpWithBLOBs;

public interface FnDumpDblogXtpMapper {
    int insert(FnDumpDblogXtpWithBLOBs record);

    int insertSelective(FnDumpDblogXtpWithBLOBs record);
}