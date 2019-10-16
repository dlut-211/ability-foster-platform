package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.FnGetAuditFileWithBLOBs;

public interface FnGetAuditFileMapper {
    int insert(FnGetAuditFileWithBLOBs record);

    int insertSelective(FnGetAuditFileWithBLOBs record);
}