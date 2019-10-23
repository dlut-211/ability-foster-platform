package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.Ability;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.StatementType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.HashMap;

/**
 * @Author: lhd
 * @Date 2019/10/23 20:19
 * @Description:
 **/
public interface PgetSubjectAbilityScoreRepository extends JpaRepository<Ability, Integer> {

    @SuppressWarnings("rawtypes")
    @Select("call p_getSubjectability_score(#{subject_id,student_id})")
    @Options(statementType= StatementType.CALLABLE )
    public HashMap getTableOfDelete(int subject_id,int student_id);
}
