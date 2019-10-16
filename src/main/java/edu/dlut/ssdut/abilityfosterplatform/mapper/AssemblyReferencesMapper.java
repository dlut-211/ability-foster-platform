package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.AssemblyReferences;

public interface AssemblyReferencesMapper {
    int insert(AssemblyReferences record);

    int insertSelective(AssemblyReferences record);
}