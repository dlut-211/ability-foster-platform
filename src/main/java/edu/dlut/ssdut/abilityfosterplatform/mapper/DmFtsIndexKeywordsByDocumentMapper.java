package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmFtsIndexKeywordsByDocument;

public interface DmFtsIndexKeywordsByDocumentMapper {
    int insert(DmFtsIndexKeywordsByDocument record);

    int insertSelective(DmFtsIndexKeywordsByDocument record);
}