package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.model.VAvgStudentClassroomScore;
import edu.dlut.ssdut.abilityfosterplatform.repository.VAvgStudentClassroomScoreRepository;
import edu.dlut.ssdut.abilityfosterplatform.service.VAvgStudentClassroomScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @Author: raymond
 * @Date 2019/10/22 15:45
 * @Description:
 **/
@Service
public class VAvgStudentClassroomScoreServiceImpl implements VAvgStudentClassroomScoreService {

    @Autowired
    private VAvgStudentClassroomScoreRepository repository;
    @Override
    public Page<VAvgStudentClassroomScore> findVAvgStudentClassroomScores(Pageable pageable) {
        return repository.findVAvgStudentClassroomScores(pageable);
    }
}
