package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DmXeObjects;

public interface DmXeObjectsMapper {
    int insert(DmXeObjects record);

    int insertSelective(DmXeObjects record);
}