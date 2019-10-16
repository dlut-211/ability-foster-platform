package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.CheckConstraints;

public interface CheckConstraintsMapper {
    int insert(CheckConstraints record);

    int insertSelective(CheckConstraints record);
}