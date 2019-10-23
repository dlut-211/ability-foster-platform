package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.model.VStudentWork;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface VStudentWorkService {

    Page<VStudentWork> VStudentWorkInfoPage(Integer StudentId, Pageable pageable);
}
