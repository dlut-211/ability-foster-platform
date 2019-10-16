package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.TraceCategories;

public interface TraceCategoriesMapper {
    int insert(TraceCategories record);

    int insertSelective(TraceCategories record);
}