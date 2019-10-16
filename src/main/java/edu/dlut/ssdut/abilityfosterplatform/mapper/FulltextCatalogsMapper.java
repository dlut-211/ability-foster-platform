package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.FulltextCatalogs;

public interface FulltextCatalogsMapper {
    int insert(FulltextCatalogs record);

    int insertSelective(FulltextCatalogs record);
}