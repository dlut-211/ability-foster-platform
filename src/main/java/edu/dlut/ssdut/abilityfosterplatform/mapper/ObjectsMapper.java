package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Objects;

public interface ObjectsMapper {
    int insert(Objects record);

    int insertSelective(Objects record);
}