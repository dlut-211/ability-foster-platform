package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.OperationLogDetails;

public interface OperationLogDetailsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OperationLogDetails record);

    int insertSelective(OperationLogDetails record);

    OperationLogDetails selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OperationLogDetails record);

    int updateByPrimaryKeyWithBLOBs(OperationLogDetails record);

    int updateByPrimaryKey(OperationLogDetails record);
}