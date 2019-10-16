package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Operationlogs;

public interface OperationlogsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Operationlogs record);

    int insertSelective(Operationlogs record);

    Operationlogs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Operationlogs record);

    int updateByPrimaryKeyWithBLOBs(Operationlogs record);

    int updateByPrimaryKey(Operationlogs record);
}