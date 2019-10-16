package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.AllViews;

public interface AllViewsMapper {
    int insert(AllViews record);

    int insertSelective(AllViews record);
}