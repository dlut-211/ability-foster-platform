package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DatabaseMirroring;

public interface DatabaseMirroringMapper {
    int insert(DatabaseMirroring record);

    int insertSelective(DatabaseMirroring record);
}