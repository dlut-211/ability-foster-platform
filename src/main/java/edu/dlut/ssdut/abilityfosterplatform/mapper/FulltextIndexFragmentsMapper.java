package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.FulltextIndexFragments;

public interface FulltextIndexFragmentsMapper {
    int insert(FulltextIndexFragments record);

    int insertSelective(FulltextIndexFragments record);
}