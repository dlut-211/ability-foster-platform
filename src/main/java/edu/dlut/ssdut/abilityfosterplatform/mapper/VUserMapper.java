package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.VUser;

public interface VUserMapper {
    int insert(VUser record);

    int insertSelective(VUser record);
}