package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.AllSqlModules;

public interface AllSqlModulesMapper {
    int insert(AllSqlModules record);

    int insertSelective(AllSqlModules record);
}