package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Triggers;

public interface TriggersMapper {
    int insert(Triggers record);

    int insertSelective(Triggers record);
}