package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.OperationLogs;

public interface OperationLogsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OperationLogs record);

    int insertSelective(OperationLogs record);

    OperationLogs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OperationLogs record);

    int updateByPrimaryKeyWithBLOBs(OperationLogs record);

    int updateByPrimaryKey(OperationLogs record);
}