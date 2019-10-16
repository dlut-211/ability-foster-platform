package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.FulltextSemanticLanguages;

public interface FulltextSemanticLanguagesMapper {
    int insert(FulltextSemanticLanguages record);

    int insertSelective(FulltextSemanticLanguages record);
}