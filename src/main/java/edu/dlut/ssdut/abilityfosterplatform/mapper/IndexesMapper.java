package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Indexes;

public interface IndexesMapper {
    int insert(Indexes record);

    int insertSelective(Indexes record);
}