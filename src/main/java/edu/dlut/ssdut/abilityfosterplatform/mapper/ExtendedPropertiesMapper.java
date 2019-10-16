package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ExtendedProperties;

public interface ExtendedPropertiesMapper {
    int insert(ExtendedProperties record);

    int insertSelective(ExtendedProperties record);
}