package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Tables;

public interface TablesMapper {
    int insert(Tables record);

    int insertSelective(Tables record);
}