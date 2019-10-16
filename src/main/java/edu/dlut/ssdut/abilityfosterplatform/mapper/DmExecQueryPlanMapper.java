package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmExecQueryPlan;

public interface DmExecQueryPlanMapper {
    int insert(DmExecQueryPlan record);

    int insertSelective(DmExecQueryPlan record);
}