package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmXeSessions;

public interface DmXeSessionsMapper {
    int insert(DmXeSessions record);

    int insertSelective(DmXeSessions record);
}