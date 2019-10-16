package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmFtsIndexKeywords;

public interface DmFtsIndexKeywordsMapper {
    int insert(DmFtsIndexKeywords record);

    int insertSelective(DmFtsIndexKeywords record);
}