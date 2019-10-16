package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmDbMissingIndexColumns;

public interface DmDbMissingIndexColumnsMapper {
    int insert(DmDbMissingIndexColumns record);

    int insertSelective(DmDbMissingIndexColumns record);
}