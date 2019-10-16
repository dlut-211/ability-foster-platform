package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.SystemColumns;

public interface SystemColumnsMapper {
    int insert(SystemColumns record);

    int insertSelective(SystemColumns record);
}