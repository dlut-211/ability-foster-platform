package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.model.VChapterWorkZjk;
import edu.dlut.ssdut.abilityfosterplatform.model.VStudentWorkChapter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface VChapterWorkService {

    //学生页面—我的课堂—章节作业
    Page<VChapterWorkZjk> VChapterWorkPage(Integer classroomId, Integer studentId, Pageable pageable);
    //学生页面——查看作业
    Page<VStudentWorkChapter> VStudentWorkChapterPage(Integer studentId,
                                                      Integer chapterId,
                                                      Integer classroomId,
                                                      Pageable pageable);
}
