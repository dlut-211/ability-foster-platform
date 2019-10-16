package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmTranLocks;

public interface DmTranLocksMapper {
    int insert(DmTranLocks record);

    int insertSelective(DmTranLocks record);
}