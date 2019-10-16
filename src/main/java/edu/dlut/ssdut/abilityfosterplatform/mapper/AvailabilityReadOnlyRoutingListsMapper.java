package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.AvailabilityReadOnlyRoutingLists;

public interface AvailabilityReadOnlyRoutingListsMapper {
    int insert(AvailabilityReadOnlyRoutingLists record);

    int insertSelective(AvailabilityReadOnlyRoutingLists record);
}