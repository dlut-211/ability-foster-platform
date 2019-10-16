package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.SystemObjects;

public interface SystemObjectsMapper {
    int insert(SystemObjects record);

    int insertSelective(SystemObjects record);
}