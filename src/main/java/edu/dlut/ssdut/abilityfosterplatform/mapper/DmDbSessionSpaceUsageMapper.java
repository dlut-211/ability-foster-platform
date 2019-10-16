package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmDbSessionSpaceUsage;

public interface DmDbSessionSpaceUsageMapper {
    int insert(DmDbSessionSpaceUsage record);

    int insertSelective(DmDbSessionSpaceUsage record);
}