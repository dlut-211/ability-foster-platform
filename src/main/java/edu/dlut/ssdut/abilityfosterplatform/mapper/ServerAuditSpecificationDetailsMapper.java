package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ServerAuditSpecificationDetails;

public interface ServerAuditSpecificationDetailsMapper {
    int insert(ServerAuditSpecificationDetails record);

    int insertSelective(ServerAuditSpecificationDetails record);
}