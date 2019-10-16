package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmDbMissingIndexGroups;

public interface DmDbMissingIndexGroupsMapper {
    int insert(DmDbMissingIndexGroups record);

    int insertSelective(DmDbMissingIndexGroups record);
}