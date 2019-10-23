package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.model.VChapterWorkZjk;
import edu.dlut.ssdut.abilityfosterplatform.repository.VChapterWorkRepository;
import edu.dlut.ssdut.abilityfosterplatform.service.VChapterWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class VChapterWorkServiceImpl implements VChapterWorkService {

    @Autowired
    private VChapterWorkRepository vChapterWorkRepository;

    @Override
    public Page<VChapterWorkZjk> VChapterWorkPage(Integer classroomId,
                                                  Integer studentId,
                                                  Pageable pageable){
        return vChapterWorkRepository.findVChapterWorkZjks(classroomId, studentId, pageable);

    }
}
