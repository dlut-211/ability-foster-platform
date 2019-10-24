package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.VStudentWorkChapter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface VStudentWorkChapterRepository extends JpaRepository<VStudentWorkChapter,String> {
    @Query(value = "SELECT @rownum\\:=@rownum+1 as id,v_student_work_chapter.* \n" +
            "FROM v_student_work_chapter,(select @rownum\\:=0) temp\n" +
            "where student_id= ? and chapter_id= ? and classroom_id= ? ",nativeQuery = true)
    Page<VStudentWorkChapter> findVStudentWorkChapters(Integer studentId,
                                                       Integer chapterId,
                                                       Integer classroomId,
                                                       Pageable pageable);
}
