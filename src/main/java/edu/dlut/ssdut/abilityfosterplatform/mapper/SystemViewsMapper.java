package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.SystemViews;

public interface SystemViewsMapper {
    int insert(SystemViews record);

    int insertSelective(SystemViews record);
}