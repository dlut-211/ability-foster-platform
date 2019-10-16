package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DatabaseAuditSpecificationDetails;

public interface DatabaseAuditSpecificationDetailsMapper {
    int insert(DatabaseAuditSpecificationDetails record);

    int insertSelective(DatabaseAuditSpecificationDetails record);
}