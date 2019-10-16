package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ConstraintTableUsage;

public interface ConstraintTableUsageMapper {
    int insert(ConstraintTableUsage record);

    int insertSelective(ConstraintTableUsage record);
}