package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.model.VAvgStudentClassroomScore;

import java.util.List;

public interface VAvgStudentClassroomScoreMapper {
    int insert(VAvgStudentClassroomScore record);

    int insertSelective(VAvgStudentClassroomScore record);

    List<VAvgStudentClassroomScore> findAll();

    List<Float>selectAVgScore(Integer studentId);
}
