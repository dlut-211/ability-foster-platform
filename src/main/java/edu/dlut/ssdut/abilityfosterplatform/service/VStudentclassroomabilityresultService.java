package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.model.VStudentClassroomAbilityResult;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface VStudentclassroomabilityresultService {
    Page<VStudentClassroomAbilityResult> VStudentclassroomabilityresultPage(Integer studentId,Pageable pageable);
}
