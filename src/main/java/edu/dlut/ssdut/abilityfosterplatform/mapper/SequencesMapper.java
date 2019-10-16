package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.Sequences;

public interface SequencesMapper {
    int insert(Sequences record);

    int insertSelective(Sequences record);
}