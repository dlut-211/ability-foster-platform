package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.FiletableSystemDefinedObjects;

public interface FiletableSystemDefinedObjectsMapper {
    int insert(FiletableSystemDefinedObjects record);

    int insertSelective(FiletableSystemDefinedObjects record);
}