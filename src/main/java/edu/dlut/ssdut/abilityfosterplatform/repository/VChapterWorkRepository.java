package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.VChapterWorkZjk;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface VChapterWorkRepository extends JpaRepository<VChapterWorkZjk, Integer> {
    @Query(value = "SELECT @rownum\\:=@rownum+1 as id, v.*\n" +
            "FROM `v_chapter_work_zjk` v, (SELECT @rownum\\:=0) temp\n" +
            "WHERE v.classroom_id = ?1 and v.student_id = ?2 ", nativeQuery = true)
    Page<VChapterWorkZjk> findVChapterWorkZjks(Integer classroomId, Integer studentId, Pageable pageable);
}
