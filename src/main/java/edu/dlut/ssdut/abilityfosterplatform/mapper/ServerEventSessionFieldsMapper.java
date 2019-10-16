package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ServerEventSessionFields;

public interface ServerEventSessionFieldsMapper {
    int insert(ServerEventSessionFields record);

    int insertSelective(ServerEventSessionFields record);
}