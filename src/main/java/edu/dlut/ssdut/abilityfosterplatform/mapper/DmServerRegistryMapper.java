package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmServerRegistry;

public interface DmServerRegistryMapper {
    int insert(DmServerRegistry record);

    int insertSelective(DmServerRegistry record);
}