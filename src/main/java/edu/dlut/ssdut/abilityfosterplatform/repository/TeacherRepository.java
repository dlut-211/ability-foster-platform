package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.Teacher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,Integer> {
    Teacher findTeacherByNumberAndPassword(String number,String password);
    Page<Teacher> findTeachersByStatusEquals(Integer status,Pageable pageable);
    Page<Teacher> findTeachersByNameContainsAndStatusEquals(String name,Integer status,Pageable pageable);
    Page<Teacher> findTeachersByNumberEqualsAndStatusEquals(String number,Integer status,Pageable pageable);
    Page<Teacher> findTeachersByNameContainsAndNumberEqualsAndStatusEquals(String name,String number,Integer status,Pageable pageable);
}
