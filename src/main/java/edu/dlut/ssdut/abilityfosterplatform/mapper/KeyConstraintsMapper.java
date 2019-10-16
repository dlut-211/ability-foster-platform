package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.KeyConstraints;

public interface KeyConstraintsMapper {
    int insert(KeyConstraints record);

    int insertSelective(KeyConstraints record);
}