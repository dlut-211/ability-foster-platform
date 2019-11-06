package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.School;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: wdz
 * @Date: 2019/11/3 18:54
 * @Description:
 **/
public interface SchoolRepository extends JpaRepository<School,Integer> {
    Page<School> findAll(Pageable pageable);
    Page<School> findSchoolsByNameContains(String name,Pageable pageable);

}
