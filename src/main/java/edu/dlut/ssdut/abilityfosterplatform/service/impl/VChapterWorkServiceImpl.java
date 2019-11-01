package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.mapper.VChapterWorkZjkMapper;
import edu.dlut.ssdut.abilityfosterplatform.model.VChapterWorkZjk;
import edu.dlut.ssdut.abilityfosterplatform.model.VStudentWorkChapter;
import edu.dlut.ssdut.abilityfosterplatform.repository.VChapterWorkRepository;
import edu.dlut.ssdut.abilityfosterplatform.repository.VStudentWorkChapterRepository;
import edu.dlut.ssdut.abilityfosterplatform.service.VChapterWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VChapterWorkServiceImpl implements VChapterWorkService {

    @Autowired
    private VChapterWorkRepository vChapterWorkRepository;
    @Autowired
    private VStudentWorkChapterRepository vStudentWorkChapterRepository;


    @Override
    public List<VChapterWorkZjk> VChapterWorkPage(Integer classroomId,
                                                  Integer studentId, Integer startSize, Integer pageSize){
        return vChapterWorkRepository.findVChapterWorkZjks(classroomId, studentId,startSize,pageSize);

    }
    @Override
    public  Page<VStudentWorkChapter> VStudentWorkChapterPage(Integer studentId,
                                                              Integer chapterId,
                                                              Integer classroomId,
                                                              Pageable pageable){
        return vStudentWorkChapterRepository.findVStudentWorkChapters(studentId, chapterId, classroomId, pageable);
    }
}
