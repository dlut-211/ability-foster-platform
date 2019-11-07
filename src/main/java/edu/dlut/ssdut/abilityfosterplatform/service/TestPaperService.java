package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.dto.TestPaperABDTO;
import edu.dlut.ssdut.abilityfosterplatform.dto.TestPaperDTO;
import edu.dlut.ssdut.abilityfosterplatform.model.TestPaper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

/**
 * @AUTHOR: raymond
 * @DATE: 2019/10/19
 * DESCRIPTION:
 **/
public interface TestPaperService {
    TestPaper addTestPaper(TestPaperDTO testPaperDTO);

    //试卷列表
    Map TestPaperPage(Integer classroomId, Pageable pageable);

    //试卷删除
    void remove(Integer testPaperId);

    //试卷编辑
    Boolean editTestPaper(TestPaperDTO testPaperDTO);

    TestPaper selectByPrimaryKey(Integer id);

    /**
     * 布置考试
     **/
    Boolean examined(Integer userId, Integer status, Integer id);

    /**
     * 撤销考试
     **/
    Boolean revokeExamined(Integer userId, Integer status, Integer id);
}
