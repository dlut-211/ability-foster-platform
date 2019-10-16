package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmExecTextQueryPlan;

public interface DmExecTextQueryPlanMapper {
    int insert(DmExecTextQueryPlan record);

    int insertSelective(DmExecTextQueryPlan record);
}