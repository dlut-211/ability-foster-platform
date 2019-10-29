package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.dto.TestPaperIdDto;
import edu.dlut.ssdut.abilityfosterplatform.mapper.StudentTestPaperMapper;
import edu.dlut.ssdut.abilityfosterplatform.mapper.SystemOptionMapper;
import edu.dlut.ssdut.abilityfosterplatform.model.StudentTestPaper;
import edu.dlut.ssdut.abilityfosterplatform.service.StudentTestPaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentTestPaperServiceImpl implements StudentTestPaperService {
    @Autowired
    private StudentTestPaperMapper studentTestPaperMapper ;


    @Override
    public Integer insertStudentTestPaper(List<TestPaperIdDto> testPaperIdDtoList) {
        return studentTestPaperMapper.insertStudentTestPaper(testPaperIdDtoList);
    }
}
