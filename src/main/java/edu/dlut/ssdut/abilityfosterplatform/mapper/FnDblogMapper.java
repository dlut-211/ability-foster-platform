package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.FnDblogWithBLOBs;

public interface FnDblogMapper {
    int insert(FnDblogWithBLOBs record);

    int insertSelective(FnDblogWithBLOBs record);
}