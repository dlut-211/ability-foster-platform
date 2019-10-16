package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.AssemblyFiles;

public interface AssemblyFilesMapper {
    int insert(AssemblyFiles record);

    int insertSelective(AssemblyFiles record);
}