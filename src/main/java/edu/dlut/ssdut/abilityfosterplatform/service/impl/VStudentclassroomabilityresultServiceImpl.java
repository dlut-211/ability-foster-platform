package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.Repository.VStudentclassroomabilityresultRepository;
import edu.dlut.ssdut.abilityfosterplatform.model.VStudentclassroomabilityresult;
import edu.dlut.ssdut.abilityfosterplatform.service.VStudentclassroomabilityresultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class VStudentclassroomabilityresultServiceImpl implements VStudentclassroomabilityresultService {
    @Autowired
    private VStudentclassroomabilityresultRepository vsr;
    @Override
    public Page<VStudentclassroomabilityresult> VStudentclassroomabilityresultPage(Integer studentId, Pageable pageable) {
        return vsr.findVStudentclassroomabilityresultsByStudentid(studentId,pageable);
    }
}
