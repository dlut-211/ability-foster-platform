package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmDbMissingIndexDetails;

public interface DmDbMissingIndexDetailsMapper {
    int insert(DmDbMissingIndexDetails record);

    int insertSelective(DmDbMissingIndexDetails record);
}