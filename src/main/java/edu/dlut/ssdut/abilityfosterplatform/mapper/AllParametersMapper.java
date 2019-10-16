package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.AllParameters;

public interface AllParametersMapper {
    int insert(AllParameters record);

    int insertSelective(AllParameters record);
}