package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.BackupDevices;

public interface BackupDevicesMapper {
    int insert(BackupDevices record);

    int insertSelective(BackupDevices record);
}