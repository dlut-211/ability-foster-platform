package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.XmlSchemaComponentPlacements;

public interface XmlSchemaComponentPlacementsMapper {
    int insert(XmlSchemaComponentPlacements record);

    int insertSelective(XmlSchemaComponentPlacements record);
}