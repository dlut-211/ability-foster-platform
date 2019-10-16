package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Branchs;

public interface BranchsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Branchs record);

    int insertSelective(Branchs record);

    Branchs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Branchs record);

    int updateByPrimaryKeyWithBLOBs(Branchs record);

    int updateByPrimaryKey(Branchs record);
}