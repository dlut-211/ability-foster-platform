package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmTranActiveTransactions;

public interface DmTranActiveTransactionsMapper {
    int insert(DmTranActiveTransactions record);

    int insertSelective(DmTranActiveTransactions record);
}