package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ServerAuditSpecifications;

public interface ServerAuditSpecificationsMapper {
    int insert(ServerAuditSpecifications record);

    int insertSelective(ServerAuditSpecifications record);
}