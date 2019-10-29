package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.dto.TestPaperDTO;
import edu.dlut.ssdut.abilityfosterplatform.model.TestPaper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @AUTHOR: raymond
 * @DATE: 2019/10/19
 * DESCRIPTION:
 **/
public interface TestPaperService {
    Boolean addTestPaper(TestPaperDTO testPaperDTO);

    //试卷列表
    Page<TestPaper> TestPaperPage(Integer classroomId, Pageable pageable);
    //试卷删除
    void remove(Integer testPaperId);

    //试卷编辑
    Boolean editTestPaper(TestPaperDTO testPaperDTO);

    TestPaper selectByPrimaryKey(Integer id);
}
