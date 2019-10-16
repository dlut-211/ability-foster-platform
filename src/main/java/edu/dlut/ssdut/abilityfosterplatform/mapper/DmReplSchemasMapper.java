package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmReplSchemasWithBLOBs;

public interface DmReplSchemasMapper {
    int insert(DmReplSchemasWithBLOBs record);

    int insertSelective(DmReplSchemasWithBLOBs record);
}