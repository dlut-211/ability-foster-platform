package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ConstraintColumnUsage;

public interface ConstraintColumnUsageMapper {
    int insert(ConstraintColumnUsage record);

    int insertSelective(ConstraintColumnUsage record);
}