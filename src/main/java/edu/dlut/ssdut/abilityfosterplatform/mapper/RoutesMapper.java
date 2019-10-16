package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Routes;

public interface RoutesMapper {
    int insert(Routes record);

    int insertSelective(Routes record);
}