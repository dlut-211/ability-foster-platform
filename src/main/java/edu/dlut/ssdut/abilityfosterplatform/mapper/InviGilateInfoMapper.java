package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.InviGilateInfo;

public interface InviGilateInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(InviGilateInfo record);

    int insertSelective(InviGilateInfo record);

    InviGilateInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(InviGilateInfo record);

    int updateByPrimaryKeyWithBLOBs(InviGilateInfo record);

    int updateByPrimaryKey(InviGilateInfo record);
}