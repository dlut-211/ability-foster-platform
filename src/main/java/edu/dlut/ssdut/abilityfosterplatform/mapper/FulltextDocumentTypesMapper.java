package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.FulltextDocumentTypes;

public interface FulltextDocumentTypesMapper {
    int insert(FulltextDocumentTypes record);

    int insertSelective(FulltextDocumentTypes record);
}