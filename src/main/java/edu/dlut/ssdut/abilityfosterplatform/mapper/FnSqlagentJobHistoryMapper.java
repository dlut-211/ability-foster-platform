package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.FnSqlagentJobHistory;

public interface FnSqlagentJobHistoryMapper {
    int insert(FnSqlagentJobHistory record);

    int insertSelective(FnSqlagentJobHistory record);
}