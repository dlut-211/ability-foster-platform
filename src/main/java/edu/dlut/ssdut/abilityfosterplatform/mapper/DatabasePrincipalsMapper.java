package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DatabasePrincipals;

public interface DatabasePrincipalsMapper {
    int insert(DatabasePrincipals record);

    int insertSelective(DatabasePrincipals record);
}