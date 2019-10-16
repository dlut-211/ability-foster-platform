package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.IdentityColumns;

public interface IdentityColumnsMapper {
    int insert(IdentityColumns record);

    int insertSelective(IdentityColumns record);
}