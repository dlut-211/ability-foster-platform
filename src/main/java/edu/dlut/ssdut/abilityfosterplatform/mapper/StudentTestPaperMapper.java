package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.dto.TestPaperIdDto;
import edu.dlut.ssdut.abilityfosterplatform.model.StudentTestPaper;

import java.util.List;

public interface StudentTestPaperMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StudentTestPaper record);

    int insertSelective(StudentTestPaper record);

    StudentTestPaper selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StudentTestPaper record);

    int updateByPrimaryKey(StudentTestPaper record);

    Integer insertStudentTestPaper (  List<TestPaperIdDto> testPaperIdDtoList);

}