package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.AssemblyTypes;

public interface AssemblyTypesMapper {
    int insert(AssemblyTypes record);

    int insertSelective(AssemblyTypes record);
}