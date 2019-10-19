package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.VStudentWork;

public interface VStudentWorkMapper {
    int insert(VStudentWork record);

    int insertSelective(VStudentWork record);
}