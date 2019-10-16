package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Parameters;

public interface ParametersMapper {
    int insert(Parameters record);

    int insertSelective(Parameters record);
}