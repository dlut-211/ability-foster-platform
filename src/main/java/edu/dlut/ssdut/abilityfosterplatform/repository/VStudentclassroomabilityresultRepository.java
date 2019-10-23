package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.VStudentClassroomAbilityResult;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface VStudentclassroomabilityresultRepository extends JpaRepository<VStudentClassroomAbilityResult, Integer> {
    @Query(value = "select @rownum\\:=@rownum+1 as id,v_student_classroom_ability_result.*" +
            "FROM `v_student_classroom_ability_result`,(select @rownum\\:=0) temp\n"+
            "where student_id=?1",
            nativeQuery = true)
    Page<VStudentClassroomAbilityResult> findVStudentClassroomAbilityResultData(Integer studentId,Pageable pageable);
}
