package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.RemoteServiceBindings;

public interface RemoteServiceBindingsMapper {
    int insert(RemoteServiceBindings record);

    int insertSelective(RemoteServiceBindings record);
}