package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.AllObjects;

public interface AllObjectsMapper {
    int insert(AllObjects record);

    int insertSelective(AllObjects record);
}