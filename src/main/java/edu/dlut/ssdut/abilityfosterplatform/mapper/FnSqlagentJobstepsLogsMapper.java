package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.FnSqlagentJobstepsLogs;

public interface FnSqlagentJobstepsLogsMapper {
    int insert(FnSqlagentJobstepsLogs record);

    int insertSelective(FnSqlagentJobstepsLogs record);
}