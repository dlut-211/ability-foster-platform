package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.VStudentWork;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface VStudentWorkRepository extends JpaRepository<VStudentWork,String>{
    @Query(value = "select @rownum\\:=@rownum+1 as id,v_classroom_student_info.*\n" +
            "from v_classroom_student_info, (select @rownum\\:=0) temp\n" +
            "WHERE v_classroom_student_info.student_id= ? ",nativeQuery = true)
    Page<VStudentWork> findVStudentWorkByStudentId(Integer studentId, Pageable pageable);
}
