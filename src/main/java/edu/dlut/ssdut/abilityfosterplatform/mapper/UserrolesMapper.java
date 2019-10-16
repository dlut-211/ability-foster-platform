package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Userroles;

public interface UserrolesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Userroles record);

    int insertSelective(Userroles record);

    Userroles selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Userroles record);

    int updateByPrimaryKeyWithBLOBs(Userroles record);

    int updateByPrimaryKey(Userroles record);
}