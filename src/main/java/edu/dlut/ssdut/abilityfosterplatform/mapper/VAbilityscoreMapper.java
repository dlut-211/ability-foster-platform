package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.VAbilityscore;

public interface VAbilityscoreMapper {
    int insert(VAbilityscore record);

    int insertSelective(VAbilityscore record);
}