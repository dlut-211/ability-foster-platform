package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.ReferentialConstraints;

public interface ReferentialConstraintsMapper {
    int insert(ReferentialConstraints record);

    int insertSelective(ReferentialConstraints record);
}