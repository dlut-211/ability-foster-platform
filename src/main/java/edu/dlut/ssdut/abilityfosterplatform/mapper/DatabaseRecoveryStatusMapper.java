package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DatabaseRecoveryStatus;

public interface DatabaseRecoveryStatusMapper {
    int insert(DatabaseRecoveryStatus record);

    int insertSelective(DatabaseRecoveryStatus record);
}