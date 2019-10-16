package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmFtsMemoryBuffers;

public interface DmFtsMemoryBuffersMapper {
    int insert(DmFtsMemoryBuffers record);

    int insertSelective(DmFtsMemoryBuffers record);
}