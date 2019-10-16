package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.DomainConstraints;

public interface DomainConstraintsMapper {
    int insert(DomainConstraints record);

    int insertSelective(DomainConstraints record);
}