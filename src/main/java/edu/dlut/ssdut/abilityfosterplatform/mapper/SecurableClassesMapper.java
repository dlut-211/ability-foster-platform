package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.SecurableClasses;

public interface SecurableClassesMapper {
    int insert(SecurableClasses record);

    int insertSelective(SecurableClasses record);
}