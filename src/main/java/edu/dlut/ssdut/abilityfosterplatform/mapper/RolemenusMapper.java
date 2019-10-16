package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Rolemenus;

public interface RolemenusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Rolemenus record);

    int insertSelective(Rolemenus record);

    Rolemenus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Rolemenus record);

    int updateByPrimaryKeyWithBLOBs(Rolemenus record);

    int updateByPrimaryKey(Rolemenus record);
}