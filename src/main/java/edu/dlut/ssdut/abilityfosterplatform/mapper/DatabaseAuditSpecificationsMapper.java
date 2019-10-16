package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DatabaseAuditSpecifications;

public interface DatabaseAuditSpecificationsMapper {
    int insert(DatabaseAuditSpecifications record);

    int insertSelective(DatabaseAuditSpecifications record);
}