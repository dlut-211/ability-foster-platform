package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmFtsIndexKeywordsByProperty;

public interface DmFtsIndexKeywordsByPropertyMapper {
    int insert(DmFtsIndexKeywordsByProperty record);

    int insertSelective(DmFtsIndexKeywordsByProperty record);
}