package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmTranVersionStoreWithBLOBs;

public interface DmTranVersionStoreMapper {
    int insert(DmTranVersionStoreWithBLOBs record);

    int insertSelective(DmTranVersionStoreWithBLOBs record);
}