package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Testpaper;

public interface TestpaperMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Testpaper record);

    int insertSelective(Testpaper record);

    Testpaper selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Testpaper record);

    int updateByPrimaryKeyWithBLOBs(Testpaper record);

    int updateByPrimaryKey(Testpaper record);
}