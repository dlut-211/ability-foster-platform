package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Invigilateinfo;

public interface InvigilateinfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Invigilateinfo record);

    int insertSelective(Invigilateinfo record);

    Invigilateinfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Invigilateinfo record);

    int updateByPrimaryKeyWithBLOBs(Invigilateinfo record);

    int updateByPrimaryKey(Invigilateinfo record);
}