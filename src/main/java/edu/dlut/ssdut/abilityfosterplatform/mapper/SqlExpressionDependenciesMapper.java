package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.SqlExpressionDependencies;

public interface SqlExpressionDependenciesMapper {
    int insert(SqlExpressionDependencies record);

    int insertSelective(SqlExpressionDependencies record);
}