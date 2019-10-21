package edu.dlut.ssdut.abilityfosterplatform.repository;

import edu.dlut.ssdut.abilityfosterplatform.model.VStudentWork;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VStudentWorkRepository extends JpaRepository<VStudentWork,String>{
    Page<VStudentWork> findVStudentWorkByStudentId(Integer StudentId, Pageable pageable);
}
