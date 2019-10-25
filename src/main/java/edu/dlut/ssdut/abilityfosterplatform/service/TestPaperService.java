package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.dto.TestPaperDTO;
import edu.dlut.ssdut.abilityfosterplatform.model.TestPaper;
import org.springframework.web.multipart.MultipartFile;

/**
 * @AUTHOR: raymond
 * @DATE: 2019/10/19
 * DESCRIPTION:
 **/
public interface TestPaperService {
    Boolean addTestPaper(TestPaperDTO testPaperDTO);

    TestPaper selectByPrimaryKey(Integer id);

}
