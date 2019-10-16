package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.SqlModules;

public interface SqlModulesMapper {
    int insert(SqlModules record);

    int insertSelective(SqlModules record);
}