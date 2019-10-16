package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Filegroups;

public interface FilegroupsMapper {
    int insert(Filegroups record);

    int insertSelective(Filegroups record);
}