package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DestinationDataSpaces;

public interface DestinationDataSpacesMapper {
    int insert(DestinationDataSpaces record);

    int insertSelective(DestinationDataSpaces record);
}