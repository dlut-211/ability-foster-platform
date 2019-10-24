package edu.dlut.ssdut.abilityfosterplatform.service;

import edu.dlut.ssdut.abilityfosterplatform.dto.NameAndAvgScoreDTO;

import java.util.List;

/**
 * @Author :zjk
 * @Date :Create in 19:04 2019-10-23
 * @Description 课程平均分以及学生分数比较
 **/
public interface ClassRoomAvgScoreService {
    public List<Float> getStudentAvgScore(Integer studentId);
    public List<NameAndAvgScoreDTO>getClassroomNameAndAvgScore(Integer studentId);
}
