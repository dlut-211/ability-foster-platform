package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Types;

public interface TypesMapper {
    int insert(Types record);

    int insertSelective(Types record);
}