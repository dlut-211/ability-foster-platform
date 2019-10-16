package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Ability;

public interface AbilityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ability record);

    int insertSelective(Ability record);

    Ability selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ability record);

    int updateByPrimaryKeyWithBLOBs(Ability record);

    int updateByPrimaryKey(Ability record);
}