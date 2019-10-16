package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Sysmembers;

public interface SysmembersMapper {
    int insert(Sysmembers record);

    int insertSelective(Sysmembers record);
}