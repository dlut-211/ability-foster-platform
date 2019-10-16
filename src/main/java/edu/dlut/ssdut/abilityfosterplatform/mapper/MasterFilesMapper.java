package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.MasterFiles;

public interface MasterFilesMapper {
    int insert(MasterFiles record);

    int insertSelective(MasterFiles record);
}