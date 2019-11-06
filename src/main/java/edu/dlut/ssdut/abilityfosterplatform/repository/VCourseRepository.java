package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.VCourse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: raymond
 * @Date: 2019/11/5 21:40
 * @Description:
 **/
public interface VCourseRepository extends JpaRepository<VCourse, Integer> {
    Page<VCourse> findAllByCodeContainingAndNameContaining(String code, String name, Pageable pageable);
}
