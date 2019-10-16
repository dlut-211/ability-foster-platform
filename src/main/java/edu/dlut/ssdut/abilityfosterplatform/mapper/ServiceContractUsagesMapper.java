package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ServiceContractUsages;

public interface ServiceContractUsagesMapper {
    int insert(ServiceContractUsages record);

    int insertSelective(ServiceContractUsages record);
}