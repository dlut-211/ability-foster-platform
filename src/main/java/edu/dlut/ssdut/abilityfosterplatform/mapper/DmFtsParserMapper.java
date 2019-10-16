package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmFtsParser;

public interface DmFtsParserMapper {
    int insert(DmFtsParser record);

    int insertSelective(DmFtsParser record);
}