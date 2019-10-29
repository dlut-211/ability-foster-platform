package edu.dlut.ssdut.abilityfosterplatform.mapper;

import edu.dlut.ssdut.abilityfosterplatform.dto.NameAndAvgScoreDTO;
import edu.dlut.ssdut.abilityfosterplatform.model.VAvgClassroomScore;

import java.util.List;

public interface VAvgClassroomScoreMapper {
    int insert(VAvgClassroomScore record);

    int insertSelective(VAvgClassroomScore record);

    List<NameAndAvgScoreDTO>selectNameAndScore(Integer studentId);
}
