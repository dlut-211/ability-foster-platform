package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Workknowledge;

public interface WorkknowledgeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Workknowledge record);

    int insertSelective(Workknowledge record);

    Workknowledge selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Workknowledge record);

    int updateByPrimaryKeyWithBLOBs(Workknowledge record);

    int updateByPrimaryKey(Workknowledge record);
}