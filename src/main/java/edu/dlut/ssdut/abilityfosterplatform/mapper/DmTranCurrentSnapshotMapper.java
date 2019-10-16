package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmTranCurrentSnapshot;

public interface DmTranCurrentSnapshotMapper {
    int insert(DmTranCurrentSnapshot record);

    int insertSelective(DmTranCurrentSnapshot record);
}