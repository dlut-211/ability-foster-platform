package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ResourceGovernorConfiguration;

public interface ResourceGovernorConfigurationMapper {
    int insert(ResourceGovernorConfiguration record);

    int insertSelective(ResourceGovernorConfiguration record);
}