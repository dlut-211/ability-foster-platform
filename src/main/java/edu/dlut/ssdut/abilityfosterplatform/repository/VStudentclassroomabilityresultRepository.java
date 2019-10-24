package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.VStudentClassroomAbilityResult;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @Author: raymond
 * @Date 2019/10/22 21:30
 * @Description:
 **/
public interface VStudentClassroomAbilityResultRepository extends JpaRepository<VStudentClassroomAbilityResult, Integer> {
    @Query(value = "select v_student_classroom_ability_result.classroom_id, v_student_classroom_ability_result.classroom_name,v_student_classroom_ability_result.student_id, v_student_classroom_ability_result.name_exp_4, v_student_classroom_ability_result.name_exp_5, @rownum\\:=@rownum+1 as id\n" +
            "FROM v_student_classroom_ability_result, (select @rownum\\:=0) temp", nativeQuery = true)
    Page<VStudentClassroomAbilityResult> findVStudentClassroomAbilityResults(Pageable pageable);
}
