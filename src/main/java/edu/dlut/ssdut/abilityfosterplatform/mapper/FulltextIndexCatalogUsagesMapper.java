package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.FulltextIndexCatalogUsages;

public interface FulltextIndexCatalogUsagesMapper {
    int insert(FulltextIndexCatalogUsages record);

    int insertSelective(FulltextIndexCatalogUsages record);
}