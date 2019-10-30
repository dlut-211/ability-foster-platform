package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.dto.TestPaperIdDto;
import edu.dlut.ssdut.abilityfosterplatform.model.StudentTestPaper;

import java.util.List;

public interface StudentTestPaperService {
    Integer insertStudentTestPaper (  List<TestPaperIdDto> testPaperIdDtoList);

    List<StudentTestPaper>selectByTestPaperDetailId(Integer userId,Integer testPaperDetailId,Integer status);
}
