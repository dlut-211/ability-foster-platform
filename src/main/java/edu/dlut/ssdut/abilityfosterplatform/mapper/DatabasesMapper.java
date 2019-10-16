package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Databases;

public interface DatabasesMapper {
    int insert(Databases record);

    int insertSelective(Databases record);
}