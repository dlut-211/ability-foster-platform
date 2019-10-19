package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.OperationLogDetail;

public interface OperationLogDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OperationLogDetail record);

    int insertSelective(OperationLogDetail record);

    OperationLogDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OperationLogDetail record);

    int updateByPrimaryKey(OperationLogDetail record);
}