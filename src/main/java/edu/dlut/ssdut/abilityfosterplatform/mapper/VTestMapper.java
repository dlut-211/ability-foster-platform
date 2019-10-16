package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.VTest;

public interface VTestMapper {
    int insert(VTest record);

    int insertSelective(VTest record);
}