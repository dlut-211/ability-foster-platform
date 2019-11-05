package edu.dlut.ssdut.abilityfosterplatform.dto;

import lombok.Data;

import java.util.List;

/**
 * @AUTHOR: raymond
 * @DATE: 2019/10/27
 * DESCRIPTION: 学生作业数据传输对象
 **/
@Data
public class StudentWorkDTO {

    private Integer scoreCount;

    private Integer submitCount;

    private float completionRate;

    private float avgScore;

    private Integer total;

    List<VStudentWorkDTO> vStudentWorkDTOList;

}
