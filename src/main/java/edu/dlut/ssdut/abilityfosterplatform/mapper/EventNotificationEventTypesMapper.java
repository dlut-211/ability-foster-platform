package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.EventNotificationEventTypes;

public interface EventNotificationEventTypesMapper {
    int insert(EventNotificationEventTypes record);

    int insertSelective(EventNotificationEventTypes record);
}