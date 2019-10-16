package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ServiceContracts;

public interface ServiceContractsMapper {
    int insert(ServiceContracts record);

    int insertSelective(ServiceContracts record);
}