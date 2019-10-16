package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmOsChildInstances;

public interface DmOsChildInstancesMapper {
    int insert(DmOsChildInstances record);

    int insertSelective(DmOsChildInstances record);
}