package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.SqlLoginsWithBLOBs;

public interface SqlLoginsMapper {
    int insert(SqlLoginsWithBLOBs record);

    int insertSelective(SqlLoginsWithBLOBs record);
}