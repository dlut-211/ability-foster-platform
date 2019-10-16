package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.SystemInternalsPartitions;

public interface SystemInternalsPartitionsMapper {
    int insert(SystemInternalsPartitions record);

    int insertSelective(SystemInternalsPartitions record);
}