package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.VSchoolTeacher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: wdz
 * @Date: 2019/11/7 18:55
 * @Description:
 **/
public interface VSchoolTeacherRepository extends JpaRepository<VSchoolTeacher,Integer> {
    Page<VSchoolTeacher> findVSchoolTeachersByStatusEquals(Integer status, Pageable pageable);
    Page<VSchoolTeacher> findVSchoolTeachersByNameContainsAndStatusEquals(String name,Integer status,Pageable pageable);
    Page<VSchoolTeacher> findVSchoolTeachersByNumberEqualsAndStatusEquals(String number,Integer status,Pageable pageable);
    Page<VSchoolTeacher> findVSchoolTeachersByNameContainsAndNumberEqualsAndStatusEquals(String name,String number, Integer status, Pageable pageable);
}
