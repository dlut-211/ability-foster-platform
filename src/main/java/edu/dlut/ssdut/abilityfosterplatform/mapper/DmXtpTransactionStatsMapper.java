package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmXtpTransactionStats;

public interface DmXtpTransactionStatsMapper {
    int insert(DmXtpTransactionStats record);

    int insertSelective(DmXtpTransactionStats record);
}