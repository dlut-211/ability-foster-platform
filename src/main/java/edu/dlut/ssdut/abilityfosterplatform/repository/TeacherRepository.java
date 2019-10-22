package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.Teacher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher,Integer> {
    Page<Teacher> findAll(Pageable pageable);
    Page<Teacher> findTeachersByNameContains(String name,Pageable pageable);
    Page<Teacher> findTeachersByNumberEquals(String number,Pageable pageable);
    Page<Teacher> findTeachersByNameContainsAndNumberEquals(String name,String number,Pageable pageable);
    Teacher findTeacherByNumberAndPassword(String number,String password);

}
