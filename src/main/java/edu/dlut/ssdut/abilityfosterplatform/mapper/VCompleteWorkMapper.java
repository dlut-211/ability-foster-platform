package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.VCompleteWork;

public interface VCompleteWorkMapper {
    int insert(VCompleteWork record);

    int insertSelective(VCompleteWork record);
}