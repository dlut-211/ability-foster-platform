package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Studenttestpaper;

public interface StudenttestpaperMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Studenttestpaper record);

    int insertSelective(Studenttestpaper record);

    Studenttestpaper selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Studenttestpaper record);

    int updateByPrimaryKeyWithBLOBs(Studenttestpaper record);

    int updateByPrimaryKey(Studenttestpaper record);
}