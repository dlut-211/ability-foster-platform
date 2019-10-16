package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ServerEventNotifications;

public interface ServerEventNotificationsMapper {
    int insert(ServerEventNotifications record);

    int insertSelective(ServerEventNotifications record);
}