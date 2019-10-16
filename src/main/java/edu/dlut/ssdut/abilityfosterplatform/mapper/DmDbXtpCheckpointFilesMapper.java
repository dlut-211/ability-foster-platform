package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmDbXtpCheckpointFiles;

public interface DmDbXtpCheckpointFilesMapper {
    int insert(DmDbXtpCheckpointFiles record);

    int insertSelective(DmDbXtpCheckpointFiles record);
}