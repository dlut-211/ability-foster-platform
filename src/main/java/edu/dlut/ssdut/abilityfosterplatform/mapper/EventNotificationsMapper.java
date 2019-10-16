package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.EventNotifications;

public interface EventNotificationsMapper {
    int insert(EventNotifications record);

    int insertSelective(EventNotifications record);
}