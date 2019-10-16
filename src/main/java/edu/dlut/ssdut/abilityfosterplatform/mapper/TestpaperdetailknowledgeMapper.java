package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Testpaperdetailknowledge;

public interface TestpaperdetailknowledgeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Testpaperdetailknowledge record);

    int insertSelective(Testpaperdetailknowledge record);

    Testpaperdetailknowledge selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Testpaperdetailknowledge record);

    int updateByPrimaryKeyWithBLOBs(Testpaperdetailknowledge record);

    int updateByPrimaryKey(Testpaperdetailknowledge record);
}