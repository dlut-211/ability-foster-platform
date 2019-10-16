package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.AvailabilityGroups;

public interface AvailabilityGroupsMapper {
    int insert(AvailabilityGroups record);

    int insertSelective(AvailabilityGroups record);
}