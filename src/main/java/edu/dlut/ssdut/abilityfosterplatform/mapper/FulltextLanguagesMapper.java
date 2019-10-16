package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.FulltextLanguages;

public interface FulltextLanguagesMapper {
    int insert(FulltextLanguages record);

    int insertSelective(FulltextLanguages record);
}