package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Configurations;

public interface ConfigurationsMapper {
    int insert(Configurations record);

    int insertSelective(Configurations record);
}