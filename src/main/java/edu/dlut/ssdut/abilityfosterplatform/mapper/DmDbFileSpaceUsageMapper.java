package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmDbFileSpaceUsage;

public interface DmDbFileSpaceUsageMapper {
    int insert(DmDbFileSpaceUsage record);

    int insertSelective(DmDbFileSpaceUsage record);
}