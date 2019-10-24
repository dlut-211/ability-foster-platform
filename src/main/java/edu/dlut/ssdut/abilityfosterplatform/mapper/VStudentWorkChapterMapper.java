package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.VStudentWorkChapter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface VStudentWorkChapterMapper {
    int insert(VStudentWorkChapter record);

    int insertSelective(VStudentWorkChapter record);

    //学生页面——查看作业
    Page<VStudentWorkChapter> VStudentWorkChapterPage(Integer studentId,
                                                      Integer chapterId,
                                                      Integer classroomId,
                                                      Pageable pageable);
}
