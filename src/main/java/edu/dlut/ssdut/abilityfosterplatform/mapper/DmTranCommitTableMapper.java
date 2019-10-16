package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmTranCommitTable;

public interface DmTranCommitTableMapper {
    int insert(DmTranCommitTable record);

    int insertSelective(DmTranCommitTable record);
}