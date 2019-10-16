package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Companys;

public interface CompanysMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Companys record);

    int insertSelective(Companys record);

    Companys selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Companys record);

    int updateByPrimaryKeyWithBLOBs(Companys record);

    int updateByPrimaryKey(Companys record);
}