package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.model.VStudentWork;
import edu.dlut.ssdut.abilityfosterplatform.repository.VStudentWorkRepository;
import edu.dlut.ssdut.abilityfosterplatform.service.VStudentWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class VStudentWorkServiceImpl implements VStudentWorkService {

    @Autowired
    private VStudentWorkRepository vStudentWorkRepository;

    @Override
    public Page<VStudentWork> VStudentWorkInfoPage(Integer StudentId, Pageable pageable){
        return vStudentWorkRepository.findVStudentWorkByStudentId(StudentId, pageable);
    }
}
