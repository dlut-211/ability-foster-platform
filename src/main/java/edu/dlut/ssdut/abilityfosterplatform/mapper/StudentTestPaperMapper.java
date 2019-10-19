package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.StudentTestPaper;

public interface StudentTestPaperMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentTestPaper record);

    int insertSelective(StudentTestPaper record);

    StudentTestPaper selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentTestPaper record);

    int updateByPrimaryKey(StudentTestPaper record);
}