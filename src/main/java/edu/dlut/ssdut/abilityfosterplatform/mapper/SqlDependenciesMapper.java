package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.SqlDependencies;

public interface SqlDependenciesMapper {
    int insert(SqlDependencies record);

    int insertSelective(SqlDependencies record);
}