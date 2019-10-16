package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.FulltextStoplists;

public interface FulltextStoplistsMapper {
    int insert(FulltextStoplists record);

    int insertSelective(FulltextStoplists record);
}