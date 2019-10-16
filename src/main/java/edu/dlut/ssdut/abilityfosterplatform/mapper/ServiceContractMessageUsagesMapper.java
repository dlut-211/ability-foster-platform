package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ServiceContractMessageUsages;

public interface ServiceContractMessageUsagesMapper {
    int insert(ServiceContractMessageUsages record);

    int insertSelective(ServiceContractMessageUsages record);
}