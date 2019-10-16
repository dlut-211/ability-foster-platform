package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.RegisteredSearchProperties;

public interface RegisteredSearchPropertiesMapper {
    int insert(RegisteredSearchProperties record);

    int insertSelective(RegisteredSearchProperties record);
}