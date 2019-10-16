package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.TableTypes;

public interface TableTypesMapper {
    int insert(TableTypes record);

    int insertSelective(TableTypes record);
}