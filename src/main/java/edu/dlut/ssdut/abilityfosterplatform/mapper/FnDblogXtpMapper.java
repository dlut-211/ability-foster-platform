package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.FnDblogXtpWithBLOBs;

public interface FnDblogXtpMapper {
    int insert(FnDblogXtpWithBLOBs record);

    int insertSelective(FnDblogXtpWithBLOBs record);
}