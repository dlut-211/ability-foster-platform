package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.SystemParameters;

public interface SystemParametersMapper {
    int insert(SystemParameters record);

    int insertSelective(SystemParameters record);
}