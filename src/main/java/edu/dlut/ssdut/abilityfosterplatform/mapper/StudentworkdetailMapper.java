package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Studentworkdetail;

public interface StudentworkdetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Studentworkdetail record);

    int insertSelective(Studentworkdetail record);

    Studentworkdetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Studentworkdetail record);

    int updateByPrimaryKeyWithBLOBs(Studentworkdetail record);

    int updateByPrimaryKey(Studentworkdetail record);
}