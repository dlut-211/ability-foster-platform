package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Events;

public interface EventsMapper {
    int insert(Events record);

    int insertSelective(Events record);
}