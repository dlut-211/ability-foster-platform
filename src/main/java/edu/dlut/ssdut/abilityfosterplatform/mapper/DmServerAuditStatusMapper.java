package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmServerAuditStatus;

public interface DmServerAuditStatusMapper {
    int insert(DmServerAuditStatus record);

    int insertSelective(DmServerAuditStatus record);
}