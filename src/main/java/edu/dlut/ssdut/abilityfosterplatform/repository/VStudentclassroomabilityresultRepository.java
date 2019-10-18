package edu.dlut.ssdut.abilityfosterplatform.Repository;

import edu.dlut.ssdut.abilityfosterplatform.model.VStudentclassroomabilityresult;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VStudentclassroomabilityresultRepository extends JpaRepository<VStudentclassroomabilityresult, String> {
    Page<VStudentclassroomabilityresult> findVStudentclassroomabilityresultsByStudentid(Integer studentId, Pageable pageable);
}
