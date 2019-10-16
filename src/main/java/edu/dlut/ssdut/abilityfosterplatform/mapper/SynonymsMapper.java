package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Synonyms;

public interface SynonymsMapper {
    int insert(Synonyms record);

    int insertSelective(Synonyms record);
}