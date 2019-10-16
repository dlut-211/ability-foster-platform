package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DataSpaces;

public interface DataSpacesMapper {
    int insert(DataSpaces record);

    int insertSelective(DataSpaces record);
}