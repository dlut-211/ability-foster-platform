package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmXtpTransactionRecentRowsWithBLOBs;

public interface DmXtpTransactionRecentRowsMapper {
    int insert(DmXtpTransactionRecentRowsWithBLOBs record);

    int insertSelective(DmXtpTransactionRecentRowsWithBLOBs record);
}