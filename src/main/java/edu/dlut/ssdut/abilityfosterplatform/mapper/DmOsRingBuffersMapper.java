package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmOsRingBuffers;

public interface DmOsRingBuffersMapper {
    int insert(DmOsRingBuffers record);

    int insertSelective(DmOsRingBuffers record);
}