package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Studentrole;

public interface StudentroleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Studentrole record);

    int insertSelective(Studentrole record);

    Studentrole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Studentrole record);

    int updateByPrimaryKeyWithBLOBs(Studentrole record);

    int updateByPrimaryKey(Studentrole record);
}