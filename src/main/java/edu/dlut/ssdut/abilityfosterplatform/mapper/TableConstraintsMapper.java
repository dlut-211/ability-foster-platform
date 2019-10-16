package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.TableConstraints;

public interface TableConstraintsMapper {
    int insert(TableConstraints record);

    int insertSelective(TableConstraints record);
}