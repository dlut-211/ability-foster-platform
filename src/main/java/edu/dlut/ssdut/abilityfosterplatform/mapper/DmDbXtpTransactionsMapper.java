package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmDbXtpTransactionsWithBLOBs;

public interface DmDbXtpTransactionsMapper {
    int insert(DmDbXtpTransactionsWithBLOBs record);

    int insertSelective(DmDbXtpTransactionsWithBLOBs record);
}