package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.dto.TestPaperIdDto;

import java.util.List;

public interface StudentTestPaperService {
    Integer insertStudentTestPaper (  List<TestPaperIdDto> testPaperIdDtoList);
}
