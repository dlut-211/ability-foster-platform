package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Testpaperdetail;

public interface TestpaperdetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Testpaperdetail record);

    int insertSelective(Testpaperdetail record);

    Testpaperdetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Testpaperdetail record);

    int updateByPrimaryKeyWithBLOBs(Testpaperdetail record);

    int updateByPrimaryKey(Testpaperdetail record);
}