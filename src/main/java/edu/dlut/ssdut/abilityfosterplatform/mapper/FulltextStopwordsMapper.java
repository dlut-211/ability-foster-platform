package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.FulltextStopwords;

public interface FulltextStopwordsMapper {
    int insert(FulltextStopwords record);

    int insertSelective(FulltextStopwords record);
}