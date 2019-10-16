package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.FulltextSystemStopwords;

public interface FulltextSystemStopwordsMapper {
    int insert(FulltextSystemStopwords record);

    int insertSelective(FulltextSystemStopwords record);
}