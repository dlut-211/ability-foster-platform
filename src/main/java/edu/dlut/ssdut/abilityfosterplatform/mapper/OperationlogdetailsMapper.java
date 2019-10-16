package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Operationlogdetails;

public interface OperationlogdetailsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Operationlogdetails record);

    int insertSelective(Operationlogdetails record);

    Operationlogdetails selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Operationlogdetails record);

    int updateByPrimaryKeyWithBLOBs(Operationlogdetails record);

    int updateByPrimaryKey(Operationlogdetails record);
}