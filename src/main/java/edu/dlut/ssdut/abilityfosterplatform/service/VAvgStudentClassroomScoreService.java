package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.model.VAvgStudentClassroomScore;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @Author: raymond
 * @Date 2019/10/22 15:44
 * @Description:
 **/
public interface VAvgStudentClassroomScoreService {
    Page<VAvgStudentClassroomScore> findVAvgStudentClassroomScores(Pageable pageable);
}
