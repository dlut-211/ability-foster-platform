package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.VStudentTestPaper;

public interface VStudentTestPaperMapper {
    int insert(VStudentTestPaper record);

    int insertSelective(VStudentTestPaper record);
}