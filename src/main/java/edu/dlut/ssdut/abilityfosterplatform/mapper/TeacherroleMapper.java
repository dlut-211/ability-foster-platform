package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Teacherrole;

public interface TeacherroleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Teacherrole record);

    int insertSelective(Teacherrole record);

    Teacherrole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Teacherrole record);

    int updateByPrimaryKeyWithBLOBs(Teacherrole record);

    int updateByPrimaryKey(Teacherrole record);
}