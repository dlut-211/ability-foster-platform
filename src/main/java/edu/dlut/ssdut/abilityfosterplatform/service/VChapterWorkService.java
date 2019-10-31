package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.model.VChapterWorkZjk;
import edu.dlut.ssdut.abilityfosterplatform.model.VStudentWorkChapter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface VChapterWorkService {

    //学生页面—我的课堂—章节作业
    List<VChapterWorkZjk> VChapterWorkPage(Integer classroomId, Integer studentId, Integer startSize, Integer pageSize);
    //学生页面——查看作业
    Page<VStudentWorkChapter> VStudentWorkChapterPage(Integer studentId,
                                                      Integer chapterId,
                                                      Integer classroomId,
                                                      Pageable pageable);
}
