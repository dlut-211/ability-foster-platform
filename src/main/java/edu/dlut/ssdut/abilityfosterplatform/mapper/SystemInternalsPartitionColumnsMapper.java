package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.SystemInternalsPartitionColumns;

public interface SystemInternalsPartitionColumnsMapper {
    int insert(SystemInternalsPartitionColumns record);

    int insertSelective(SystemInternalsPartitionColumns record);
}