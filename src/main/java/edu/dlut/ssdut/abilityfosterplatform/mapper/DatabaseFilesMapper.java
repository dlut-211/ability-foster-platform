package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DatabaseFiles;

public interface DatabaseFilesMapper {
    int insert(DatabaseFiles record);

    int insertSelective(DatabaseFiles record);
}