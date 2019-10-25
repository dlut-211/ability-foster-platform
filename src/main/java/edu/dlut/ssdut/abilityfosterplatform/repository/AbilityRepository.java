package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.Ability;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: raymond
 * @Date 2019/10/16 21:47
 * @Description:
 **/
public interface AbilityRepository extends JpaRepository<Ability, Integer> {
    Page<Ability> findAbilitiesBySubjectId(Integer subjectId, Pageable pageable);

    Page<Ability> findAbilitiesBySubjectIdEqualsAndNameContains(Integer subjectId,String name,Pageable pageable);
}
