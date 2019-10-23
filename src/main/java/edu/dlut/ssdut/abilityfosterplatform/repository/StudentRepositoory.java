package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositoory extends JpaRepository<Student,Integer> {
    Student findStudentByNumberAndPassword(String number, String password);
}
