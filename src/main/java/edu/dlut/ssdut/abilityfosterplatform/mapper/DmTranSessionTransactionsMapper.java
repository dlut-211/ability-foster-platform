package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmTranSessionTransactions;

public interface DmTranSessionTransactionsMapper {
    int insert(DmTranSessionTransactions record);

    int insertSelective(DmTranSessionTransactions record);
}