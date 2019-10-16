package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmTranTransactionsSnapshot;

public interface DmTranTransactionsSnapshotMapper {
    int insert(DmTranTransactionsSnapshot record);

    int insertSelective(DmTranTransactionsSnapshot record);
}