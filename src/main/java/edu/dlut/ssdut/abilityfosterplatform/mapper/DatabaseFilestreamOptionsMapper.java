package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DatabaseFilestreamOptions;

public interface DatabaseFilestreamOptionsMapper {
    int insert(DatabaseFilestreamOptions record);

    int insertSelective(DatabaseFilestreamOptions record);
}