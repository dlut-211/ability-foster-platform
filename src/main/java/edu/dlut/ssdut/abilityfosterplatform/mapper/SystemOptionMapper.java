package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.SystemOption;

public interface SystemOptionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SystemOption record);

    int insertSelective(SystemOption record);

    SystemOption selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SystemOption record);

    int updateByPrimaryKey(SystemOption record);
}