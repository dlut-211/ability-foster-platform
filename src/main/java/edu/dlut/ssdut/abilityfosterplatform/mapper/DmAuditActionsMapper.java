package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmAuditActions;

public interface DmAuditActionsMapper {
    int insert(DmAuditActions record);

    int insertSelective(DmAuditActions record);
}