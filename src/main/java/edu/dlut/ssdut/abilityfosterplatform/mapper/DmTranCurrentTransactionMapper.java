package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmTranCurrentTransaction;

public interface DmTranCurrentTransactionMapper {
    int insert(DmTranCurrentTransaction record);

    int insertSelective(DmTranCurrentTransaction record);
}