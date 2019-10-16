package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ViewColumnUsage;

public interface ViewColumnUsageMapper {
    int insert(ViewColumnUsage record);

    int insertSelective(ViewColumnUsage record);
}