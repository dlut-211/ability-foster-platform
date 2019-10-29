package edu.dlut.ssdut.abilityfosterplatform.service.impl;

import edu.dlut.ssdut.abilityfosterplatform.dto.NameAndAvgScoreDTO;
import edu.dlut.ssdut.abilityfosterplatform.mapper.VAvgClassroomScoreMapper;
import edu.dlut.ssdut.abilityfosterplatform.mapper.VAvgStudentClassroomScoreMapper;
import edu.dlut.ssdut.abilityfosterplatform.service.ClassRoomAvgScoreService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author :zjk
 * @Date :Create in 19:08 2019-10-23
 * @Description classRoomAvgScoreService实现类
 **/
public class ClassRoomAvgScoreServiceImpl implements ClassRoomAvgScoreService {
    @Autowired
    private VAvgClassroomScoreMapper vAvgClassroomScoreMapper;
    @Autowired
    private VAvgStudentClassroomScoreMapper vAvgStudentClassroomScoreMapper;
    @Override
    public List<Float> getStudentAvgScore(Integer studentId) {
        return vAvgStudentClassroomScoreMapper.selectAVgScore(studentId);
    }

    @Override
    public List<NameAndAvgScoreDTO> getClassroomNameAndAvgScore(Integer studentId) {
        return vAvgClassroomScoreMapper.selectNameAndScore(studentId);
    }
}
