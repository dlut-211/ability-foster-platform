package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Assemblies;

public interface AssembliesMapper {
    int insert(Assemblies record);

    int insertSelective(Assemblies record);
}