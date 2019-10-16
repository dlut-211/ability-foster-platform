package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmTranActiveSnapshotDatabaseTransactions;

public interface DmTranActiveSnapshotDatabaseTransactionsMapper {
    int insert(DmTranActiveSnapshotDatabaseTransactions record);

    int insertSelective(DmTranActiveSnapshotDatabaseTransactions record);
}