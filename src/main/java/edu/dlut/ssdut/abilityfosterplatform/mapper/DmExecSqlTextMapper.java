package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmExecSqlText;

public interface DmExecSqlTextMapper {
    int insert(DmExecSqlText record);

    int insertSelective(DmExecSqlText record);
}