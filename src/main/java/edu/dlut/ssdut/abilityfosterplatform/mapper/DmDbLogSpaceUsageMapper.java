package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmDbLogSpaceUsage;

public interface DmDbLogSpaceUsageMapper {
    int insert(DmDbLogSpaceUsage record);

    int insertSelective(DmDbLogSpaceUsage record);
}