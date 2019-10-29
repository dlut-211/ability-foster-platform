package edu.dlut.ssdut.abilityfosterplatform.dto;

import lombok.Data;

/**
 * @Author :zjk
 * @Date :Create in 10:45 2019-10-23
 * @Description 课堂名和平均分
 **/
@Data
public class NameAndAvgScoreDTO {
    private String classroomName;
    private float avgScore;
    private float myAvgScore;
}

