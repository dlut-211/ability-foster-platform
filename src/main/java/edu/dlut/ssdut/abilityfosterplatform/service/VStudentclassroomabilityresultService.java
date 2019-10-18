package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.model.VStudentclassroomabilityresult;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface VStudentclassroomabilityresultService {
    Page<VStudentclassroomabilityresult> VStudentclassroomabilityresultPage(Integer studentId, Pageable pageable);
}
