package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmDbTaskSpaceUsage;

public interface DmDbTaskSpaceUsageMapper {
    int insert(DmDbTaskSpaceUsage record);

    int insertSelective(DmDbTaskSpaceUsage record);
}